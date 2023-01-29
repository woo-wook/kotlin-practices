package objects

open class Person(
    val gender: String,
    val name: String
)

class User(val nickname: String, gender: String, name: String): Person(gender, name)

fun main() {
    val user = User("Doyle", "MALE", "Ryu Hanwook")

    println(user)
}