package lambdas

data class Book(
    val title: String,
     val authors: List<String>
)

fun main() {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )

    val numberListOfList = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))

    println(books.flatMap(Book::authors).toSet())
    println(numberListOfList.flatten())
}