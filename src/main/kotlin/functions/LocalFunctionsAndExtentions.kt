package functions

class User(
    val id: Int,
    val name: String,
    val address: String
)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun main() {
    val user1 = User(1, "Ryu", "")
    val user2 = User(2, "Wook", "서울시..")

    user1.validateBeforeSave()
    user2.validateBeforeSave()
}