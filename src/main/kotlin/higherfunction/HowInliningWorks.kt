package higherfunction

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantReadWriteLock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()

    try {
        return action()
    }
    finally {
        lock.unlock()
    }
}

fun main() {
    val lock = ReentrantReadWriteLock()

    synchronized(lock) {
        println("Action")
    }
}