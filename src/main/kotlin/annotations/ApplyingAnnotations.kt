package annotations

fun remove() {
    // ...
}

@Deprecated(message = "remove() 메서드를 사용하세요.", replaceWith = ReplaceWith("remove()"))
fun oldRemove() {
    // ,,,
}

fun main() {
    oldRemove()
    remove()
}