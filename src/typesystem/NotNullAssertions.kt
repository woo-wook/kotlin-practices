package typesystem

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!

    println(sNotNull.length)
}

fun main() {
    ignoreNulls("TEST")
    ignoreNulls(null)
}