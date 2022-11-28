package typesystem

fun main() {
    val x = 1
    val list = listOf(1L, 2L, 3L)

    println(x.toLong() in list)
    // println(x in list) // error!
}