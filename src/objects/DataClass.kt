package objects

data class DataClass(val name: String, val postalCode: Int) {}

fun main() {
    val dataClass = DataClass("Ryu Hanwook", 1000)
    val copyDataClass = dataClass.copy(postalCode = 3000)

    println(dataClass)
    println(copyDataClass)
}