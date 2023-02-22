package reusability

class Utils {
    fun <T, C: MutableCollection<in T>> add(source: T, dest: C): C {
        dest += source
        return dest
    }

    fun <T> pet(animals: MutableList<T>) {
        for((i, value) in animals.withIndex()) {
            println("$i animal name $value")
        }
    }
}

fun main() {
    val utils = Utils()

    println(utils.add(listOf(100, 200, 300), mutableListOf(10, 20, 30)))

    utils.pet(mutableListOf("Cat", "Dog"))
}