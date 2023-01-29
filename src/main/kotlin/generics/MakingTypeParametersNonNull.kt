package generics

class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

class ProcessorNonNull<T: Any> {
    fun process(value: T) {
        value.hashCode()
    }
}

fun main() {
    // ProcessorNonNull<String?>() // 널 가능성 제약이 걸려있다.

    val processorNonNull = ProcessorNonNull<String>()
    processorNonNull.process("String Test")
}