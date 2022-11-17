package objects

abstract class MouseAdapter {
    open fun mouseClicked() = println("click!")
    open fun mouseEntered() = println("enter!")
}

class ObjectExpressions {
    val events = mutableListOf<MouseAdapter>()

    fun addEvent(adapter: MouseAdapter) = events.add(adapter)
}

fun main() {
    val event = ObjectExpressions()

    // 이렇게 변수에도 대입 가능하다.
    val adapter = object : MouseAdapter() {
        override fun mouseClicked() = println("click!!!!!!!!!!!!!!!!!!!")
        override fun mouseEntered() = println("enter!!!!!!!!!!!!!!!!!!!")
    }

    event.addEvent(
        object : MouseAdapter() {
            override fun mouseClicked() = println("click!!!!!!!!!!!!!!!!!!!")
            override fun mouseEntered() = println("enter!!!!!!!!!!!!!!!!!!!")
        }
    )
}