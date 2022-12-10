package conventions

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun Point.inc(): Point {
    return Point(x + 1, y + 1)
}

operator fun Point.dec(): Point {
    return Point(x - 1, y - 1)
}

fun main() {
    var point = Point(10, 20)

    println(-point)
    println(point--)
    println(--point)
}