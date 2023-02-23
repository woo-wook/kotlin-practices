package objectcreation

data class MyStudent(
    val name: String,
    val surname: String,
    val age: Int
) {
    var className: String = "Blue"
}

fun main() {
    val myStudent = MyStudent(name = "Ryu", age = 30, surname = "Wook")

    println(myStudent)
}