package generics

fun printSum(c: Collection<*>) {
    val intList = c as? kotlin.collections.List<Int> ?: throw IllegalArgumentException("list is expected")

    println(intList.sum())
}

fun printSumIntValue(c: Collection<Int>) {
    if(c is kotlin.collections.List<Int>) {
        println(c.sum())
    }
}

fun main() {
    printSum(listOf(1, 2, 3))
    printSumIntValue(listOf(1, 2, 3))
    printSum(listOf("1", "2", "3")) // Cast Exception
}