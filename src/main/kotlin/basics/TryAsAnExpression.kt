package elements

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun printNumber(reader: BufferedReader) {
    val number = try {
        val readLine = reader.readLine()

        Integer.parseInt(readLine)
    } catch (e: NumberFormatException) {
        return // 함수 종료
    } finally {
        reader.close()
    }

    println(number) // 예외 발생 안했을때만 출력한다.
}

fun getNumber(reader: BufferedReader): Int? {
    return try {
        val readLine = reader.readLine()

        Integer.parseInt(readLine)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun main() {
    printNumber(BufferedReader(StringReader("332")))
    printNumber(BufferedReader(StringReader("kotlin")))

    println(getNumber(BufferedReader(StringReader("332"))))
    println(getNumber(BufferedReader(StringReader("kotlin"))))
}