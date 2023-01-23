package generics

fun <T> copyData(source: MutableList<out T>, dest: MutableList<T>) {
    for(item in source) {
        dest.add(item)
    }
}