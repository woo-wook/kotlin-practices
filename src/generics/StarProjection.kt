package generics

import java.util.Random
import kotlin.reflect.KClass

fun printFirst(list: kotlin.collections.List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T: Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw java.lang.IllegalArgumentException("No validator for ${kClass.simpleName}")
}

fun main() {
    val list: MutableList<Any?> = mutableListOf(1, "qwe", 'a')
    val chars = mutableListOf('a', 'b', 'c')

    val unknownElements: MutableList<*>
            = if (Random().nextBoolean()) list else chars

    // unknownElements.add(42) // 컴파일러가 메서드 호출을 금지한다.

    println(unknownElements.first()) // Any?를 반환한다.

    printFirst(listOf("Ryu", "Cary"))

    val validatorMap = mutableMapOf<KClass<*>, FieldValidator<*>>()

    validatorMap[String::class] = DefaultStringValidator
    validatorMap[Int::class] = DefaultIntValidator

    val stringValidator = validatorMap[String::class] as FieldValidator<String> ?: throw ClassCastException()

    println(stringValidator.validate(""))
}