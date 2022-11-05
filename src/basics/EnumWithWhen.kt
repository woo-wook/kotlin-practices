package elements

enum class EnumWithWhen(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238); // 여기 사용하는 세미콜론은 필수로 사용해야 한다.

    fun rgb() = (red * 256 + green) * 256 + blue
}