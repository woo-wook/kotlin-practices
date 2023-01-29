package functions

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val builder = StringBuilder(prefix)

    for ((index, value) in this.withIndex()) {
        if(index > 0) builder.append(separator)

        builder.append(value)
    }

    builder.append(postfix)

    return builder.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
    val list = listOf(100, 2, 3, 4, 5)
    val stringList = listOf("Test", "String")

    println(list.joinToString())
    println(stringList.join()) // string arrays 에서만 사용이 가능하다!
}