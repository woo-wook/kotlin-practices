package conventions

import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(foo: Foo, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }

    operator fun setValue(foo: Foo, property: KProperty<*>, s: String) {
        TODO("Not yet implemented")
    }
}

class Foo {
    var p: String by Delegate()
}

fun main() {
    val foo = Foo()

    val oldValue = foo.p
    foo.p = "Test"
}