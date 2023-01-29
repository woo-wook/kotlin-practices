package elements

class Clazz { }

class Person(
    val name: String, // 변경 불가한 프로퍼티
    var isMarried: Boolean // 변경 가능한 프로퍼티
)

fun main() {
    val person = Person("Ryu", false)

    println(person.name); // name을 호출하면 자동으로 getter를 호출한다.
}