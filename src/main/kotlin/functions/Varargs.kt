package functions

fun makeSentence(vararg values: String): String {
    val stringBuilder = StringBuilder()

    for (value in values) {
        stringBuilder.append("$value ")
    }

    return stringBuilder.toString()
}

fun main() {
    val strings: Array<String> = arrayOf("Hi!", "I", "am", "a", "boy!")

    println(makeSentence(*strings)) // 스프레드 연산 사용
    println(makeSentence(*strings, "YeaaaaaaaaaaaAA!")) // 스프레드 연산을 사용하면 이런것도 가능하다.
}