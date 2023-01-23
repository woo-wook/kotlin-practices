package generics

fun printContents(list: kotlin.collections.List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main() {
    printContents(listOf("abc", "bac"))
    val strings = mutableListOf("abc", "bac")

    // 컴파일 되지 않는다.
    //addAnswer(strings)
    //strings.maxByOrNull { it.length }
}