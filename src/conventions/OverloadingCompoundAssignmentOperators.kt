package conventions

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

fun main() {
    val list = mutableListOf(1, 2, 3)

    list += 5

    println(list)
}