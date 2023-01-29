package higherfunction

fun lookForRyu(peoples: List<User>) {
    peoples.forEach label@ {
        if(it.name == "Ryu") return@label
    }

    peoples.forEach {
        if(it.name == "Test") return@forEach
    }

    println("Ryu might be somewhere")
}

fun main() {
    lookForRyu(listOf(User("Ryu", 28), User("Test", 22)))
}