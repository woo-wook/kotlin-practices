package generics

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    isA<String>("abc")
    isA<String>(123)

    val items = listOf("One", 2, "Three")

    println(items.filterIsInstance<String>())
}