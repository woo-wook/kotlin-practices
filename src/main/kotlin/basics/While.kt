package elements

fun main() {
    println(factorial(10))
}

fun factorial(value: Int): Int {
    var factorial = 1
    var temp = value

    while (temp >= 1) {
        factorial *= temp--
    }

    return factorial
}