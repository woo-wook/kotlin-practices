package generics

interface Producer<out T> {
    fun produce(): T
}

open class Animal() {
    fun feed() {

    }
}

class Cat : Animal() {
    fun cleanLitter() { }
}

class Herd<out T: Animal> {
    private val store: kotlin.collections.List<T> = mutableListOf()

    val size: Int
        get() = store.size

    operator fun get(i: Int): T = store[i]
}

fun feedAll(animals: Herd<Animal>) {
    for(i in 0 until animals.size) {
        animals[i].feed()
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()

        feedAll(cats)
    }
}

