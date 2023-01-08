package higherfunction

fun twoAndThree(operation: (Int, Int) -> Int) {
    var result = operation(2, 3)
    println("The result is $result")
}

fun main() {
    twoAndThree { a, b -> a + b}
    twoAndThree { a, b -> a * b}
}