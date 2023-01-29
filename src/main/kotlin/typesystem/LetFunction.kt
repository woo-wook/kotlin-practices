package typesystem

fun sendEmailTo(email: String) {
    println("Sending Email to $email")
}

fun getTheBestPersonInTheWorld(): String? = null

fun main() {
    var email: String? = "ryu@test.me"

    email?.let { sendEmailTo(it) }

    email = null

    email?.let { sendEmailTo(it) }

    getTheBestPersonInTheWorld()?.let {
        sendEmailTo(it)
    }
}