package objects

class CompanionObjects private constructor(val nickName: String) {

    companion object {
        fun newSubscribingUser(email: String) = CompanionObjects(email.substringBefore('@'))
        fun newFacebookUser(name: String) = CompanionObjects(name)
    }
}

fun main() {
    // CompanionObjects() 생성자 호출 불가

    val newSubscribingUser = CompanionObjects.newSubscribingUser("test@hanwook.me")
    val newFacebookUser = CompanionObjects.newFacebookUser("wook")

    println("newSubscribingUser: ${newSubscribingUser.nickName}")
    println("newFacebookUser: ${newFacebookUser.nickName}")
}