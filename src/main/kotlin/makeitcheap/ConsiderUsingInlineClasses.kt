package makeitcheap

@JvmInline
value class Name(private val name: String)

class User(
    val name: Name,
    val age: Int
)

fun main() {
    val user = User(Name("user"), 30)

    println(user.name)
    println(user.age)
}