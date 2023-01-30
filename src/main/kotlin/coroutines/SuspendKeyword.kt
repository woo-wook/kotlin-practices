package coroutines

import kotlinx.coroutines.*

suspend fun yieldThreeTimes() {
    log("1")
    delay(1000L)
    yield()

    log("2")
    delay(1000L)
    yield()

    log("3")
    delay(1000L)
    yield()

    log("4")
}

fun main() {

//    GlobalScope.launch {
//        yieldThreeTimes()
//    }
    runBlocking {
        launch {
            yieldThreeTimes()
        }
    }
}