package readability

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.ObjectInputStream
import java.util.zip.ZipInputStream

class View {
    fun showPerson(person: Person) {
        println(person)
    }

    fun showError() {
        println("Error!")
    }
}

data class Person(
    val isAdult: Boolean
)

fun main() {
    val view = View()
    val person: Person? = Person(false)

    // 같은 코드다.
    if(person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    person?.takeIf { it.isAdult }
        ?.let(view::showPerson)
        ?: view.showError()


    // 이정도 비용은 지불하자.
    FileInputStream("/file.gz")
        .let(::BufferedInputStream)
        .let(::ZipInputStream)
        .let(::ObjectInputStream)
        .readObject()
}