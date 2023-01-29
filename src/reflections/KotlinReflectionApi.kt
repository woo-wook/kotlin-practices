package reflections

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties


class Person(
    val name: String,
    val age: Int
) {
    fun joinNameAgeOrDefault(default: String) = name + age + default
}

fun printString(string: String) = println(string)

fun sum(x: Int, y: Int) = x + y

var counter = 0

fun main() {
    val person = Person("Ryu", 28)

    val kClass = person.javaClass.kotlin

    // person.javaClass = java.lang.Object.getClass()
    // person.javaClass.kotlin = kotlin.reflect.KClass

    println(kClass.simpleName)
    kClass.memberProperties.forEach {
        println(it.name)
    }

    kClass.memberFunctions.forEach {
        println(it.name)

        if(it.name == "joinNameAgeOrDefault") {
            println(it.call(person, "String"))
        }
    }

    val kFunction = ::printString // KFunction
    kFunction.call("String")

    val kFunction2 = ::sum

    println(kFunction2.invoke(1, 2) + kFunction2.invoke(3, 4))

    val kProperty = ::counter

    kProperty.setter.call(21)
    println(kProperty.get())

    kClass.memberProperties.forEach {
        println(it.get(person))
    }
}