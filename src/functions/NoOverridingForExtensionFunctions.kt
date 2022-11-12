package functions

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()
    view.click() // 실제로는 button.click() 가 호출된다.
    view.showOff() // 얘는... view.showOff() 가 호출된다.
}