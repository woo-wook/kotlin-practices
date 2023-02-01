package reflections

import kotlin.reflect.KParameter
import kotlin.reflect.full.primaryConstructor

data class Item(
    val price: Int
)

fun main() {
    val item = Item(10000)

    val kClass = item.javaClass.kotlin

    val primaryConstructor = kClass.primaryConstructor!!

    val parameters = hashMapOf<KParameter, Any?>()

    primaryConstructor.parameters.forEach {
        parameters[it] = 1000
    }

    val item2 = primaryConstructor.callBy(parameters)

    println(item2.price)
}