package conventions

class Email(val to: String, val from: String, val contents: String)
class EmailUser(val name: String) {
//    private var _emails: List<Email>? = null
//
//    val emails: List<Email>
//        get() {
//            if(_emails == null) {
//                _emails = loadEmail(this)
//            }
//
//            return _emails!!
//        }

    val emails by lazy {
        loadEmail(this)
    }
}

fun loadEmail(user: EmailUser): List<Email> {
    println("${user.name}의 이메일을 가져옵니다.")
    return listOf(
        Email("test@test.com", "test@test.com", "테스트 111"),
        Email("test@test.com", "test@test.com", "테스트 222"),
        Email("test@test.com", "test@test.com", "테스트 333"),
        Email("test@test.com", "test@test.com", "테스트 444")
    )
}

fun main() {
    val emailUser = EmailUser("Ryu")

    println(emailUser.emails)
}