package readability

fun Int.factorial(): Int = (1..this).product()
fun Iterable<Int>.product(): Int = fold(1) { acc, i -> acc * i}

operator fun Int.not() = factorial()

fun main() {
    println(10 * !6)
}