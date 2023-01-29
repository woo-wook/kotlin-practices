package lambdas

fun createAllDoneRunnable(): Runnable = Runnable { println("All Done!") }

fun main() {
    createAllDoneRunnable().run()
}