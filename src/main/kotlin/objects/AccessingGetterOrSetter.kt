package objects

class AccessingGetterOrSetter {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                    address was chenged:
                     "$field" -> "$value"
                """.trimIndent()
            )

            field = value
        }
}

fun main() {
    val accessingGetterOrSetter = AccessingGetterOrSetter()

    accessingGetterOrSetter.address = "Test Address"
}