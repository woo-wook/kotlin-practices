package typesystem

fun showProgress(progess: Int) {
    val percent = progess.coerceIn(0, 100)

    println("We're ${percent}% done!")
}

fun main() {
    showProgress(144)
    showProgress(30)
}