package objects

class CompanionObjectsAsRegularObjects {
    companion object Loader {
        fun fromJSON(jsonText: String) = CompanionObjectsAsRegularObjects()
    }
}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class CompanionObjectsImplementsObjects(val name: String) {
    companion object : JSONFactory<CompanionObjectsImplementsObjects> {
        override fun fromJSON(jsonText: String) = CompanionObjectsImplementsObjects("Test")
    }
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T = factory.fromJSON("{a: a}")

// 동반객체 확장하기
fun CompanionObjectsImplementsObjects.Companion.getJSON() = "{'test': true}"

fun main() {
    loadFromJSON(CompanionObjectsImplementsObjects) // == CompanionObjectsImplementsObjects.Companion

    // 확장한 동반객체를 사용할 수 있다.
    CompanionObjectsImplementsObjects.getJSON()
}

