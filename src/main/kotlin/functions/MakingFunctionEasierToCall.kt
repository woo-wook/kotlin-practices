package functions

fun <T> joinToString(collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""): String {
    val builder = StringBuilder(prefix)

    for((index, value) in collection.withIndex()) {
        if (index > 0) {
            builder.append(separator)
        }

        builder.append(value)
    }

    builder.append(postfix)
    return builder.toString()
}

fun main() {
    println(joinToString(listOf(1, 2, 3, 4), ";", "(", ")")) // 어떤 역할을 하는지 구분하기가 너무 어렵다!
    println(joinToString(listOf(1, 2, 3, 4), separator = ";", prefix = "(", postfix = ")")) // 함수에 전달하는 인자를 명시하면 혼동이 줄어든다.
    println(joinToString(listOf(1, 2, 3, 4))) // 함수에 전달하는 인자를 명시하면 혼동이 줄어든다.
}