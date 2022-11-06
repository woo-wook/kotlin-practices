package elements

import java.util.TreeMap

fun createBinaryMap(): TreeMap<Char, String> {
    val binaryMap = TreeMap<Char, String>()

    for(c in 'A'..'F') {
        binaryMap[c] = Integer.toBinaryString(c.code)
    }

    return binaryMap
}

fun createStringList() = arrayListOf("10", "11", "1001")

fun main() {
    val binaryMap = createBinaryMap()

    for((key, value) in binaryMap) {
        println("$key = $value")
    }

    val stringList = createStringList()

    for((index, element) in stringList.withIndex()) {
        println("$index: $element")
    }
}