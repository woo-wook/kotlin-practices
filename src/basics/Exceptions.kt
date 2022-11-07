package elements

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader): Int? {
    try {
        val readLine = reader.readLine()

        return Integer.parseInt(readLine)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main() {
    val reader = BufferedReader(StringReader("239"))

    println(readNumber(reader))

    val stringReader = BufferedReader(StringReader("kotlin"))

    println(readNumber(stringReader))
}