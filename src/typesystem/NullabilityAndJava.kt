package typesystem

import javatype.Person
import javatype.StringProcessor
import java.util.*

fun yellAt(person: Person) {
    println(person.name.uppercase(Locale.getDefault()) + "!!!")
}

class StringPrinter: StringProcessor {
    override fun process(value: String) { // 널 가능성을 정해야 한다.
        println(value)
    }
}

fun main() {
    // yellAt(Person(null)) // NPE
}