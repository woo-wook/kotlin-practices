package conventions

class NameComponents(val name: String, val extension: String) {
    operator fun component1() = name
    operator fun component2() = extension
}

fun splitFileName(fullName: String): NameComponents {
    val (name, extension) = fullName.split(".", limit = 2)

    return NameComponents(name, extension)
}

fun main() {
    val (name, ext) = splitFileName("example.kt")
    println(name)
    println(ext)

    val map = mapOf("Oracle" to "Java", "Jetbrains" to "Kotlin")

    for((key, value) in map) {
        println("$key -> $value")
    }
}