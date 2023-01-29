package conventions

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object: Iterator<LocalDate> {
        var current = start

        override fun hasNext(): Boolean = current <= endInclusive

        override fun next(): LocalDate = current.apply {
            current = plusDays(1)
        }
    }

fun main() {
    val newYear = LocalDate.ofYearDay(2023, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for(dayOff in daysOff) {
        println(dayOff)
    }
}