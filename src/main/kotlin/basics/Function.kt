package elements

class Function {

    /**
     * 블록이 본문인 함수
     */
    fun max(a: Int, b: Int): Int {
        return if(a > b) a else b
    }

    /**
     * 식이 본문인 함수
     */
    fun min(a: Int, b: Int): Int = if(a < b) a else b
}

fun main() {
    val function = Function()
    println("max : " + function.max(3, 4));
    println("min : " + function.min(3, 4));
}