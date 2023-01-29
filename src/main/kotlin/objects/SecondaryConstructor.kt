package objects

open class WebView(
    val browser: String,
    val color: String
) {
    constructor(browser: String): this(browser, "RED")
}

class MyWebButton(
    val positionX: Double,
    val positionY: Double,

    browser: String,
    color: String
): WebView(browser, color) {
    constructor(positionX: Double): this(positionX, 10.3, "Safari", "RED");
}

fun main() {
    val myWebButton = MyWebButton(30.3)

    println("browser: ${myWebButton.browser}, color: ${myWebButton.color}, positionX: ${myWebButton.positionX}, positionY: ${myWebButton.positionY}")
}