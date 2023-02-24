package classdesign

typealias onClick = (printMessage: String) -> Unit

fun setOnClickListener(listener: onClick) {
    listener("test")
}

fun main() {
    setOnClickListener {
        println(it)
    }
}

