package elements

import java.util.Random

class CustomAccessor { }

class Rectangle(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main() {
    val rectangle = Rectangle(10, 10)

    println(rectangle.height)
    println(rectangle.width)
    println(rectangle.isSquare)
}