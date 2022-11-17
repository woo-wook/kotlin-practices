package lambdas

fun main() {
    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))


    // 이건 모두 같은 호출이다.
    peoples.maxByOrNull({ p: Person -> p.age})
    peoples.maxByOrNull({ p -> p.age})
    peoples.maxByOrNull { p -> p.age}
    peoples.maxByOrNull { it.age }
    peoples.maxByOrNull() { it.age } // 마지막 호출은 람다를 밖으로 뺄 수 있다.
}