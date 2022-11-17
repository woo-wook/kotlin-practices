package lambdas

fun main() {
    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))

    peoples.maxByOrNull(Person::age)

    val createPerson = ::Person // 생성자를 저장해두기

    val person = createPerson("Test", 300)
}