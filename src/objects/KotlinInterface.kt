package objects

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button: Clickable {
    override fun click() = println("I was clicked!")
}

class View: Clickable, Focusable {
    override fun click() = println("View was clicked!")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button: Clickable = Button()

    button.click()
    button.showOff()

    val view = View()

    view.setFocus(false)
    view.click()
    view.showOff()
}
