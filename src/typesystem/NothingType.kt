package typesystem

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    val member = Member("Wook", 27)

    val age = member.age ?: fail("No age")

    println(age.toLong())
}