package coroutines

import kotlin.coroutines.RestrictsSuspension
import kotlin.coroutines.*

interface Generator<out R, in T> {
    fun next(param: T): R?
}

@RestrictsSuspension
interface GeneratorBuilder<in T, R> {
    suspend fun yield(value: T): R
    suspend fun yieldAll(generator: Generator<T, R>, param: R)
}

internal class GeneratorCoroutine<T, R>: Generator<T, R>, GeneratorBuilder<T, R>, Continuation<Unit> {
    lateinit var nextStep: (R) -> Unit

    private var lastValue: T? = null
    private var lastException: Throwable? = null

    override fun next(param: R): T? {
        nextStep(param)

        lastException?.let {
            throw it
        }

        return lastValue
    }

    override suspend fun yield(value: T): R = suspendCoroutine {
            continuation ->
                    lastValue = value
                    nextStep = { param -> continuation.resume(param) }
    }

    override suspend fun yieldAll(generator: Generator<T, R>, param: R) = suspendCoroutine sc@ {
        cont ->
            lastValue = generator.next(param)
            if(lastValue == null) {
                return@sc Unit
            }

            nextStep = {
                param ->
                    lastValue = generator.next(param)
                if (lastValue == null) {
                    cont.resume(Unit)
                }
            }
    }

    override val context: CoroutineContext get() = EmptyCoroutineContext

    override fun resumeWith(result: Result<Unit>) {
        result.onSuccess {
            lastValue = null
        }.onFailure {
            lastException = it
        }
    }
}

fun <T, R> generate(block: suspend GeneratorBuilder<T, R>.(R) -> Unit): Generator<T, R> {
    val coroutine = GeneratorCoroutine<T, R>()
    val initial: suspend (R) -> Unit = { result -> block(coroutine, result) }

    coroutine.nextStep = { param -> initial.startCoroutine(param, coroutine) }

    return coroutine
}

fun idMaker() = generate<Int, Unit> {
    var index = 0

    while (index < 3)
        yield(index++)
}

fun main() {
    val gen = idMaker()

    println(gen.next(Unit))
    println(gen.next(Unit))
    println(gen.next(Unit))
    println(gen.next(Unit))
}

