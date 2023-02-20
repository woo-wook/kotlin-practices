package safety

import kotlin.properties.Delegates

class Printer {
    private var printerId: Int by Delegates.notNull()

    fun print() {
        println("Print!")
        println(printerId)
    }

    fun process(user: User?) {
        requireNotNull(user)

        val name = user.name ?: throw IllegalArgumentException()

        println(name)
    }
}

fun makePrinterOrNull(): Printer? {
    return Printer()
}

fun main() {
    val printer = makePrinterOrNull()

    printer?.print() // safe call

    if(printer != null) { // smart cast
        printer.print()
    }

    printer?.process(null)
}