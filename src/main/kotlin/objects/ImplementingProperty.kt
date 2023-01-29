package objects

interface ServerUser {
    val nickname: String
}

class PrivateUser(override val nickname: String): ServerUser // 주 생성자 프로퍼티 사용

class SubscribingUser(val email: String): ServerUser {
    override val nickname: String
        get() = email.substringBefore("@") // custom getter (매번 호출 됨)
}

class FacebookUser(val accountId: Int): ServerUser {
    override val nickname = getUserName() // 프로퍼티 초기화 식 (초기화 시 한번만 호출 됨)

    private fun getUserName(): String = "TESTUSER"
}

fun main() {
    val privateUser = PrivateUser("사용자1")
    val subscribingUser = SubscribingUser("test@hanwook.me")
    val facebookUser = FacebookUser(1000)

    println("privateUser: ${privateUser.nickname}, subscribingUser: ${subscribingUser.nickname}, facebookUser: ${facebookUser.nickname}")

}
