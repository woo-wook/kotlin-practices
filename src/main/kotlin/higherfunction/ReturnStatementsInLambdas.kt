package higherfunction

fun lookForAlice(peoples: List<User>) {
//    for (person in peoples) {
//        if (person.name == "Alice") {
//            println("Found!")
//            return
//        }
//    }

    peoples.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }

    println("Alice is not found")
}

fun main() {
    val peoples = listOf(User("Alice", 29), User("Ryu", 28))

    lookForAlice(peoples)
}