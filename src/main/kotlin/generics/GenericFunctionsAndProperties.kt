package generics

fun main() {
    val letters = ('a'..'z').toList()

    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))
}