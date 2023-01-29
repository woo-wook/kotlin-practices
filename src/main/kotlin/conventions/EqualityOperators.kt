package conventions

class NewPoint(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if(other === this) return true
        if(other !is NewPoint) return false
        return other.x == x && other.y == y
    }
}

fun main() {
    println(NewPoint(10, 20) == NewPoint(10, 20))
    println(NewPoint(10, 20) != NewPoint(5, 5))
    println(null == NewPoint(5, 5))
}