package typesystem

class User(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? User ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = User("Dmitry", "Jemerov")
    val p2 = User("Dmitry", "Jemerov")

    println(p1 == p2)
    println(p1.equals(42))
}