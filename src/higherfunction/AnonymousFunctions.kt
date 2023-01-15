package higherfunction

fun lookForDoyle(peoples: List<User>) {
    peoples.forEach(fun (person) {
        if(person.name == "Doyle") return
        println("${person.name} is not Doyle")
    })
}

fun filterByAge(peoples: List<User>, age: Int) = peoples.filter(fun (person): Boolean {
    return person.age > age
})

fun main() {
    val peoples = listOf(User("Doyle", 33), User("Cary", 25))

    lookForRyu(peoples)

    println(filterByAge(peoples, 30))
}