package lambdas

fun main() {
    val peoples = listOf(Person("Bob", 31), Person("Alice", 27), Person("Wook", 27))

    val ageMap = peoples.groupBy(Person::age)

    println(ageMap)
}

