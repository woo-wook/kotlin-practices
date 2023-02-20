package safety

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun countCharactersInFile(path: String): Int {
    val bufferedReader = BufferedReader(FileReader(path))

    bufferedReader.use {
        return bufferedReader.lineSequence().sumOf { it.length }
    }
}

fun countCharactersInFile2(path: String): Int =
    File(path).useLines { lines ->
        lines.sumOf { it.length }
    }