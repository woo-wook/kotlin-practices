package typesystem

import javatype.CollectionUtils

fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list)) // 읽기 전용이지만 데이터가 변경된다!
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c", "d")
    printInUppercase(list)
}