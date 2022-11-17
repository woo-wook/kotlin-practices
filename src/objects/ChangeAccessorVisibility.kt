package objects

class ChangeAccessorVisibility {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val changeAccessorVisibility = ChangeAccessorVisibility()

    changeAccessorVisibility.addWord("Test Word")

    println("changeAccessorVisibility.counter: ${changeAccessorVisibility.counter}")
}