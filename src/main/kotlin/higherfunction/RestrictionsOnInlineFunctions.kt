package higherfunction

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    // ....

    inlined()
    notInlined()

    // ....
}