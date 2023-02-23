package objectcreation


class MyNewUser(
    val name: String,
    val age: Int
) {
    companion object {
        fun of(name: String, age: Int): MyNewUser {
            return MyNewUser(name, age)
        }
    }
}