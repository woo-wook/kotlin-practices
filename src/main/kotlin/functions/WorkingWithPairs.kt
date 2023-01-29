package functions

fun main() {

    mapOf(1 to "one", 7 to "seven", 53.to("fifty-three")) // 해당 함수를 호출한것과 같다.

    val pair = 1 to "one"

    val(number, name) = pair // 구조 분해 선언

    val list = listOf(1, 2, 3, 4, 5)

    for((index, value) in list.withIndex()) { // 구조 분해 선언 활용
        println("$index : $value")
    }
}