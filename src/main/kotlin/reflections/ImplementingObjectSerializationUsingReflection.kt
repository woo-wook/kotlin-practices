package reflections

import kotlin.reflect.full.memberProperties

private fun StringBuilder.serializeObject(obj: Any) {
    val kClass = obj.javaClass.kotlin
    val properties = kClass.memberProperties

    append(properties.joinToString(this, prefix = "{", postfix = "}") {
        it.name + " : " + it.get(obj) + ", "
    })
}

fun serialize(obj: Any): String = buildString {
    serializeObject(obj)
}

fun main() {
    println(serialize(Person("Ryu", 28)))
}