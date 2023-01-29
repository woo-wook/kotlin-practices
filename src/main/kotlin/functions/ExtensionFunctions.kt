package functions

fun String.lastChar(): Char = this[this.length - 1]

fun main() {
    val str = "String Tests"

    println(str.lastChar())
}