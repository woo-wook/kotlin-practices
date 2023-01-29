package functions

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val string = "Test String!"
    println(string.lastChar)

    val stringBuilder = StringBuilder("Kotlin?")
    println(stringBuilder)

    stringBuilder.lastChar = '!'

    println(stringBuilder)
}