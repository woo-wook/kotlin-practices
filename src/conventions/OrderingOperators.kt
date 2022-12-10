package conventions

class Person(
    val firstName: String, val lastName: String
): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName) // 인자로 받은 값을 차례로 호출하면서 값을 비교한다.
    }
}
fun main() {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")

    println(p1 < p2)
    println(p1 > p2)
}