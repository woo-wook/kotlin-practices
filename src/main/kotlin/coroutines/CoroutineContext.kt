package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun context() {
    runBlocking {
        launch { // 부모 컨텍스트 사용
            println("main runBlocking: I'm working in thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) { // 특정 스레드에 종속 X
            println("Unconfined: I'm working in thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) { // 기본 디스패처 사용
            println("Default: I'm working in thread ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyOwnThread")) { // 새 스레드 사용
            println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
        }
    }
}

fun main() {
    context()
}