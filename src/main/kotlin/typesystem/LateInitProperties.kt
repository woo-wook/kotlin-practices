package typesystem

class MyService {
    fun performAction() = "foo"
}

class Table {
    private lateinit var myService: MyService

    fun setUp() {
        this.myService = MyService()
    }

    fun action() {
        println(myService.performAction())
    }
}

fun main() {
    val table = Table()

    table.setUp()
    table.action()
}