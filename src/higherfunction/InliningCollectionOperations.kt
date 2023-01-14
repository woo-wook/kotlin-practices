package higherfunction

data class User(val name: String, val age: Int)

fun main() {
    val users = listOf(User("Test", 29), User("Ryu", 28))

    println(users.filter { it.age < 30 })

    val result = mutableListOf<User>()

    for(user in users) {
        if(user.age < 30) result.add(user)
    }

    println(result)

    println(users.filter { it.age > 28 }.map(User::name))
}