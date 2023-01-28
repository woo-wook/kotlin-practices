package annotations

import kotlin.reflect.KClass

annotation class Logging(
    val logger: KClass<out Any> // out이 없으면 Any::class 만 넘길 수 있다.
)

@Logging(String::class)
fun main() {}