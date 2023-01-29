package objects

internal open class TalkativeButton: Focusable {
    private fun yell() = println("Hey!")
    protected fun wisper() = println("Let's talk!")
}

//fun TalkativeButton.giveSpeech() { // public member가 TalkativeButton internal 타입을 노출하므로써 선언이 불가하다.
//    yell() // private 멤버에 접근 불가하다.
//    wisper() // protected 멤버에 접근 불가하다.
//}