package functions

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullname = path.substringAfterLast("/")

    val filename = fullname.substringBeforeLast(".")
    val extension = fullname.substringAfterLast(".")

    println("directory : $directory, name : $filename, extension : $extension")
}

fun parsePathByRegExp(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if(matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured

        println("directory : $directory, name : $filename, extension : $extension")
    }
}


fun main() {
    parsePath("/Users/Doyle/Test.java")
    parsePathByRegExp("/Users/Doyle/Test.java")
}