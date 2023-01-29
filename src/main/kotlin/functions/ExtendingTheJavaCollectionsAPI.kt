package functions

fun main() {

    val list = listOf("first", "second", "fourteenth")

    println(list.last()) // 확장 함수다!

    val numbers: Collection<Int> = setOf(1, 2, 3, 5, 16)

    println(numbers.maxOrNull()) // 확장 함수다!
}