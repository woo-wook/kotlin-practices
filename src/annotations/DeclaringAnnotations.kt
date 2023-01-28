package annotations

annotation class JsonExclude(
    val name: String
)

@JsonExclude("test")
fun test() { }