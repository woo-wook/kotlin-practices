package readability

import java.util.Date

class Holiday(var millis: Long) {
    var date: Date // 프로퍼티는 접근자의 집합이다.
        get() {
            return Date(millis)
        }
        set(value) {
            millis = value.time
        }
}

// 확장 함수도 정의 가능하다.
val Holiday.date: Date
    get() = Date(this.millis + 30)


fun main() {
    val user = Holiday(103058883)

    println(user.date)

    user.date = Date()

    println(user.date)
}
