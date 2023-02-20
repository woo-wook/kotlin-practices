package safety

fun factorial(n: Int): Long {
    require(n >= 0) {
        "n 은 0 보다 커야한다."
    }

    return if(n <= 1) 1 else factorial(n - 1) * n
}

fun speak(text: String?) {
    check(!text.isNullOrEmpty()) {
        "text는 널이나 빈값이 아니여야 한다."
    }

    println(text)
}

fun sendEmail(email: String?, subject: String, contents: String) {
    requireNotNull(email) // smart cast

    println("""
        $email
        Subject : $subject
        
        $contents
    """.trimIndent())
}

fun main() {
    // factorial(-30) // java.lang.IllegalArgumentException
    // speak("") // java.lang.IllegalStateException
    sendEmail("test@test.com", "제목", "내용")
}