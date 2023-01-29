package elements

class EnumWithWhen {}

enum class Color(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238); // 여기 사용하는 세미콜론은 필수로 사용해야 한다.

    fun rgb() = (red * 256 + green) * 256 + blue
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
        Color.GREEN -> "Neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "Cold"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.BLUE && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.BLUE) -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) || (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

fun main() {
    println(getMnemonic(Color.RED))
    println(getWarmth(Color.ORANGE))
    println(mix(Color.RED, Color.YELLOW))
    println(mixOptimized(Color.RED, Color.YELLOW))
    println(mixOptimized(Color.RED, Color.INDIGO))
}
