package functions

fun main() {
    println("12.345-6.A".split("."))

    // 이 두개는 같은 결과를 반환한다.
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))
}