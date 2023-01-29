package objects

class UniversalObjectMethods(val name: String, val postalCode: Int) {

    override fun toString() = "UniversalObjectMethods(name=$name, postalCode=$postalCode)"
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is UniversalObjectMethods) {
            return false
        }

        return name == other.name && postalCode == other.postalCode
    }
    override fun hashCode() = name.hashCode() * 31 + postalCode
}