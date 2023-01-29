package functions

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("$opCount")
}

fun main() {
    println(joinToString(listOf(1,2,3,4))) // 같은 패키지에 선언되어 있는 메서드를 찾아온다.

    performOperation()
    reportOperationCount()
}