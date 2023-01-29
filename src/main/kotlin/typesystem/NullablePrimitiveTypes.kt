package typesystem

data class Member(
    val name: String,
    val age: Int? = null) {

    fun isOlderThen(other: Member): Boolean? {
        if(age == null || other.age == null) {
            return null
        }

        return age > other.age
    }
}

fun main() {
    println(Member("Sam", 35).isOlderThen(Member("Amy", 42)))
    println(Member("Sam", 35).isOlderThen(Member("Jane")))
}