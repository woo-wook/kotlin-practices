package lambdas

import java.lang.StringBuilder

fun alphabet(): String {
    val stringBuilder = StringBuilder()

    for(letter in 'A'..'Z') {
        stringBuilder.append(letter)
    }

    stringBuilder.append("\nNow I Know the alphabet!")

    return stringBuilder.toString()
}

fun alphabetV2(): String {
    val stringBuilder = StringBuilder()

    return with(stringBuilder) {
        for(letter in 'A'..'Z') {
            append(letter)
        }

        append("\nNow I Know the alphabet!")

        toString()
    }
}

fun alphabetV3() = StringBuilder().apply {
    for(letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I Know the alphabet!")

    toString()
}

fun alphabetV4() = buildString {
    for(letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I Know the alphabet!")

    // tostring을 자동으로 호출해준다.
}

fun main() {
    println(alphabet())
    println(alphabetV2())
    println(alphabetV3())
    println(alphabetV4())
}