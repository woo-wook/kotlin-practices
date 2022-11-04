package elements

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"

    println("Hello, $name!")
    println("${name}이 안녕?") // 한글은 유니코드 변수 이름으로 지었을 때 한글을 한번에 식별자로 인식하는 버그(?)가 있다.
}