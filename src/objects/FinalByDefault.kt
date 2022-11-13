package objects

// open keyword를 통해 상속이 가능
open class RichButton : Clickable {
    final override fun click() {} // 해당 메서드는 상속받은 곳에서 override 할 수 없다.
}

abstract class Animated {
    abstract fun animate() // 구현이 필수
    open fun stopAnimating() { } // 구현이 가능하다. (선택)
    fun animateTwice() { } // 구현이 불가하다.
}

class Video: Animated() {
    override fun animate() = println("Video Animate!")
}