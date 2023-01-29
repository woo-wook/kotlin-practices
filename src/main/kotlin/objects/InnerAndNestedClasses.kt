package objects

import java.io.Serializable

interface State: Serializable

interface UserView {
    fun getCurrentState(): State
    fun restoreState(state: State) { }
}

class UserButton: UserView {
    override fun getCurrentState(): State {
        return UserButtonState(1, "Ryu")
    }

    override fun restoreState(state: State) {
        println("restore view, state : $state")
    }

    class UserButtonState(
        id: Long,
        name: String
    ): State
}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}