package higherfunction

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val stringBuilder = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            stringBuilder.append(separator)
        }

        stringBuilder.append(transform(element))
    }

    stringBuilder.append(postfix)
    return stringBuilder.toString()
}

fun main() {
    val list = listOf("1", "3", "9")

    println(list.joinToString())
}