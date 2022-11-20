package lambdas

fun main() {
    val canBeInClub27 = {p: Person -> p.age <= 27}

    val peoples = listOf(Person("Bob", 31), Person("Alice", 27), Person("Wook", 25))

    println(peoples.all(canBeInClub27))
    println(peoples.any(canBeInClub27))
    println(peoples.count(canBeInClub27))
    println(peoples.filter(canBeInClub27).size) // count를 사용하자
    println(peoples.find(canBeInClub27))
}