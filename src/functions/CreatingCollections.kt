package functions

fun main() {
    val set = setOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "One", 7 to "Seven", "53" to "Fifty-Three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    for((key, value) in map) {
        println("$key : $value")
    }
}