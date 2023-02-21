package readability

fun main() {
    (1..10).joinToString("|")
    (1..100).joinToString(separator = "|") // 훨씬 이해하기 쉽다.
}