package annotations

import kotlin.reflect.KClass

interface Bootable<T> {
    fun boot(value: T)
}

annotation class Boot(
    val bootClass: KClass<out Bootable<*>>
)