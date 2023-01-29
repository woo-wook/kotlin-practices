package higherfunction

enum class Delivery {
    STANDARD,
    EXPEDITED
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if(delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }

    return { order -> 1.2 * order.itemCount }
}

data class Person(val firstName: String, val lastName: String, val phoneNumber: String?)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPridicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix) }

        if(!onlyWithPhoneNumber) {
            return startsWithPrefix
        }

        return { startsWithPrefix(it) && it.phoneNumber != null }
    }
}


fun main() {
    val shippingCostCalculator = getShippingCostCalculator(Delivery.EXPEDITED)

    println("Shipping costs ${shippingCostCalculator(Order(3))}")

    val contacts = listOf(
        Person("Ryu", "Wook", "123-3333"),
        Person("Kim", "Min", "123-3333")
    )

    val contactListFilters = ContactListFilters()

    with(contactListFilters) {
        prefix = "R"
        onlyWithPhoneNumber = true
    }

    println(contacts.filter(contactListFilters.getPridicate()))
}