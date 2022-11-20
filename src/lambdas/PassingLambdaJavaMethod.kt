package lambdas

fun postponeComputation(delay: Long, computation: Runnable) {
    Thread.sleep(delay)

    computation.run()
}

fun main() {
    // 무명 객체를 생성해 계속 사용
    postponeComputation(1000) {
        println(42)
    }

    // 객체를 매번 생성해 사용
    postponeComputation(1000, object: Runnable {
        override fun run() {
            println(42)
        }
    })

    // 객체를 매번 생성해 사용(주변 변수 포획)
    fun handelComputation(id: String) {
        postponeComputation(1000) {
            println(id)
        }
    }

    handelComputation("Wook")
}