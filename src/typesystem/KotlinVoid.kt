package typesystem

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor: Processor<Unit> {
    override fun process() {
        // 리턴을 명시 할 필요가 없다!
    }
}