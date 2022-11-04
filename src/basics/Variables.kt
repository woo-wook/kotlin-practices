package elements

fun main() {
    val question = "그리고 아무도 없었다?"
    val answer = 10
    val answer2: Int = 10

    println(question.javaClass)
    println(answer.javaClass)
    println(answer2.javaClass)

    val yearToCompute = 7.5e6 // double
    val yearToCompute2: Double = 7.5 // double

    println(yearToCompute.javaClass)
    println(yearToCompute2.javaClass)

    val value = 10 // final 변수
    var variable = 30 // 일반 변수

    // value = 30 // error!
    variable = 20

    println(value)
    println(variable)

    var message = 10

    // message = "헤헤.. 테스트" // compile error!
}