package reflections

import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

@Target(AnnotationTarget.PROPERTY)
annotation class TestAnnotation(
    val message: String
)

data class User(
    @TestAnnotation("message") val name: String,
    val age: Int
)

fun main() {
    val user = User("Ryu", 28)

    val kClass = user.javaClass.kotlin

    kClass.memberProperties.filter {
        it.findAnnotation<TestAnnotation>() != null
    }

    kClass.memberProperties.forEach {
        val annotation = it.findAnnotation<TestAnnotation>()

        println(annotation?.message)
    }
}