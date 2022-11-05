package elements

class CustomAccessor { }

class Rectangle(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean
        get() = height == width
}

fun main() {
    val rectangle = Rectangle(10, 10)

    println(rectangle.height)
    println(rectangle.width)
    println(rectangle.isSquare)
}