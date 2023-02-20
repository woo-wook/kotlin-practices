package safety

import typesystem.isNullOrEmptyOrBlank

fun readTextOrNull(text: String?): String? {
    if(text.isNullOrEmptyOrBlank()) {
        return null
    }

    return "result"
}

fun readText(text: String?): Result<String> {
    if(text.isNullOrEmptyOrBlank()) {
        return Result.failure(IllegalStateException())
    }

    return Result.success("result")
}

fun main() {
    println(readTextOrNull(""))
    println(readText(null).getOrDefault("test"))
}