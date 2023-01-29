package generics

import java.util.ServiceLoader

interface Service

inline fun <reified T> loadService(): ServiceLoader<T>
    = ServiceLoader.load(T::class.java)

fun main() {
    ServiceLoader.load(Service::class.java)
    loadService<Service>()
}