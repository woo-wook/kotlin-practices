package readability

class Node(val name: String) {
    fun makeChild(childName: String) =
        create("$name.$childName")
            .apply {
                println("Created $name")
            }

    fun makeChild2(childName: String) =
        create("${this.name}.$childName")
        .apply {
            println("Created ${this?.name}") // 언팩을 해야하네?..
        }

    fun create(name: String): Node? = Node(name)
}

fun main() {
    val node = Node("parent")

    node.makeChild("child")
    node.makeChild2("child") // 같은 결과가 아닐 수 있다!
}