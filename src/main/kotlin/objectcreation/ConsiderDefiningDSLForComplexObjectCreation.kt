package objectcreation

fun table(init: TableBuilder.() -> Unit): TableBuilder {
    return TableBuilder()
}

class TableBuilder {
    fun tr(init: TrBuilder.() -> Unit) { }
}

class TrBuilder {
    fun td(init: TdBuilder.() -> Unit) { }
}

class TdBuilder {
    var text = ""

    operator fun String.unaryPlus() {
        text += this
    }
}

fun main() {
    table {
        tr {
            td {
                + "This is row"
            }
        }
    }
}