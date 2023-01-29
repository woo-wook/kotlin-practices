package generics

import java.lang.Appendable
import java.lang.StringBuilder

fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T) where T: CharSequence, T: Appendable {
    if(!seq.endsWith(".")) {
        seq.append(".")
    }
}

fun main() {
    println(max("Kotlin", "Java"))

    val seq = StringBuilder("Hello World")

    ensureTrailingPeriod(seq)

    println(seq)
}