package conventions

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

operator fun Point.plus(other: Int) = Point(x + other, y + other)
operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())
operator fun Point.div(scale: Double) = x / y / scale

fun main() {
    val p1 = Point(10, 20);
    val p2 = Point(30, 65);

    println(p1 + p2)
    println(p1 + 10)
    println(p2 * 1.5)
    println(p2 / 1.5)
}