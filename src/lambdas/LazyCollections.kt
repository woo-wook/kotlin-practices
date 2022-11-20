package lambdas

fun main() {
    // 아무것도 출력되지 않음 (최종 연산 X)
    listOf(1, 2, 3, 4).asSequence()
        .map {
            println("map($it)")
            it * it
        }
        .filter {
            println("filter($it)")
            it % 2 == 0
        }

    listOf(1, 2, 3, 4).asSequence()
        .map {
            println("map($it)")
            it * it
        }
        .filter {
            println("filter($it)")
            it % 2 == 0
        }
        .toList()

    listOf(1, 2, 3, 4).asSequence()
        .map {
            println("map($it)")
            it * it
        }.find { it > 3 }

    val peoples = listOf(Person("Bob", 31), Person("Alice", 27), Person("Wook", 27))

    // 두 결과는 같지만 수행 횟수는 다르다.
    println(peoples.asSequence().map(Person::name).filter { it.length < 4 }.toList())
    println(peoples.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())

    // 시퀀스를 만들기
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }

    println(numbersTo100.sum())
}