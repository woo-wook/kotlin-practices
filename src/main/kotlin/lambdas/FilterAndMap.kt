package lambdas

fun main() {
    val list = listOf(1, 2, 3, 4)

    println(list.filter { it % 2 == 0 })

    val persons = listOf(Person("Min", 29), Person("Wook", 27), Person("Bob", 31))

    println(persons.filter { it.age % 2 == 1 }.map(Person::name))

    val map = mapOf(0 to "Zero", 1 to "One", 2 to "Two", 3 to "Three")

    println(map.filterKeys { it % 2 == 1 }.mapValues { it.value.uppercase() })
}