package higherfunction

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

fun readFirstLineFormFile(path: String): String {
    BufferedReader(FileReader(path)).use {
        return it.readLine()
    }
}

fun main() {
    val lock: Lock = ReentrantLock()

    lock.withLock {
        println("Action")
    }
}