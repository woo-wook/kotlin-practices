package objects

import java.io.File

object ObjectDeclarations : Comparator<File> {
    override fun compare(o1: File?, o2: File?): Int {
        return o1!!.path.compareTo(o2!!.path, ignoreCase = true)
    }
}

fun main() {
    val files = listOf(File("/Z"), File("/A"))

    println(files.sortedWith(ObjectDeclarations))
}