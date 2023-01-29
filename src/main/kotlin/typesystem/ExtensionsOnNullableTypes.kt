package typesystem

fun String?.isNullOrEmptyOrBlank(): Boolean =
    this == null || this.isBlank() || this.isEmpty()

fun main() {
    val test1: String? = null
    val test2: String? = " "
    val test3: String? = "테스트"

    println(test1.isNullOrEmptyOrBlank())
    println(test2.isNullOrEmptyOrBlank())
    println(test3.isNullOrEmptyOrBlank())
}