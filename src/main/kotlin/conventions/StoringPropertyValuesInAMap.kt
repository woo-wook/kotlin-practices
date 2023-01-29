package conventions

class PhoneBookUser {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
        // get() = _attributes["name"]!!
}

fun main() {
    val u = PhoneBookUser()

    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")

    for((key, value) in data) {
        u.setAttribute(key, value)
    }

    println(u.name)
}