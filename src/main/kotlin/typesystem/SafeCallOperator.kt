package typesystem

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if(country != null) country else "Unknown"
}

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob smith", ceo)

    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)

    println(person.countryName())
}