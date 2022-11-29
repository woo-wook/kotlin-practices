package typesystem

fun printElements(args: Array<String>) {
    args.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}

fun main() {
    val letters = Array(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)
    println(fiveZeros)
    println(fiveZerosToo)

    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())

    printElements(arrayOf("Hello", "Welcome"))
}
