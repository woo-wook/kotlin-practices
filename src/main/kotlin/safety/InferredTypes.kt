package safety

open class Animal

class Zebra : Animal()

fun main() {
    val animal = Zebra()
    // animal = Animal() // Error: Type mismatch
}