package typesystem

fun strLenSafe(s: String?) = if(s != null) s.length else 0

fun main() {
    val x: String? = null

    println(strLenSafe(x))
    println(strLenSafe("abc"))
}