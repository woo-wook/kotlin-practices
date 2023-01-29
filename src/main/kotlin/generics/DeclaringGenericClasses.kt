package generics

interface List<T> {
    operator fun get(index: Int): T
}

class StringList: List<String> {
    override fun get(index: Int): String {
        return ""
    }
}