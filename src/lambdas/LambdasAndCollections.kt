data class Person(val name: String, val age: Int)

fun main() {
    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))

    println(peoples.maxByOrNull { it.age }) // 두개는 같다
    println(peoples.maxByOrNull(Person::age)) //
}
