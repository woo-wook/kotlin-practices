package elements

fun recognize(c: Char) =
    when(c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know.."
    }

fun main() {
    println(recognize('8'))

    println("Kotlin" in "Java".."Scala") // "Java" <= "Kotlin" && "Kotlin" <= "Scala"와 같다.
    println("Kotlin" in setOf("Java", "Scala")) // 해당 집합에는 Kotlin이 없다.
}