package classdesign

data class FullName(
    val firstName: String,
    val lastName: String
)

fun String.parseName(): FullName? {
    val indexOfLastSpace = this.trim().lastIndexOf(" ")

    if(indexOfLastSpace < 0) {
        return null
    }

    return FullName(this.take(indexOfLastSpace), this.drop(indexOfLastSpace))
}

fun main() {
    val name = "Hanwook Ryu"

    println(name.parseName())
}