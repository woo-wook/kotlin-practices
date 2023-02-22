package reusability

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Order {
    val value by lazy { createValue() }

    var items: List<String> by
    Delegates.observable(listOf()) { _, _, _ ->
        notifyDateSetChanged()
    }

    var key: String? by
    Delegates.observable(null) { _, old, new ->
        println("key changed from $old to $new")
    }

    var token: String? by LoggingProperty(null)
    var attempts: Int by LoggingProperty(0)

    private fun notifyDateSetChanged() {
        println("data changed!")
    }

    private fun createValue(): Int {
        return 30
    }
}

class LoggingProperty<T>(var value: T) {
    operator fun getValue(
        thisRef: Any?,
        prop: KProperty<*>
    ): T {
        println("${prop.name} returned value $value [$thisRef]")
        return value
    }

    operator fun setValue(
        thisRef: Any?,
        prop: KProperty<*>,
        newValue: T
    ) {
        val name = prop.name
        println("$name changed from $value to $newValue [$thisRef]")
        value = newValue
    }
}

fun main() {
    val order = Order()

    println(order.value)

    order.items += "신발"
    order.key = "130"

    order.token = "asd2333"
    println(order.token)

    order.attempts = 500
    println(order.attempts)
}