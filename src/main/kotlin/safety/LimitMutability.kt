package safety

import java.lang.Exception
import kotlin.concurrent.thread


class InsufficientFunds: Exception()

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    fun withdraw(withdrawAmount: Double) {
        if (balance < withdrawAmount) {
            throw InsufficientFunds()
        }

        balance -= withdrawAmount
    }
}

val name: String? = "Test"
val surname: String = "test2"

val fullName: String?
    get() = name?.let {
        "$it $surname"
    }

val fullName2: String? = name?.let { "$it $surname" }

data class User(
    val name: String,
    val surname: String
)

fun main() {
    val bankAccount = BankAccount()

    println(bankAccount.balance)

    bankAccount.deposit(100.0)
    println(bankAccount.balance)

    bankAccount.withdraw(50.0)
    println(bankAccount.balance)

    if (fullName2 != null) {
        // println(fullName.length) // 오류
    }

    if (fullName2 != null) {
        println(fullName2.length)
    }

    val user = User("Doyle", "Ryu")
    val newUser = user.copy(surname = "Kim")

    println(user)
    println(newUser)

    var list = listOf<Int>()

    for (i in 1..1000) {
        thread {
            list = list + i
        }
    }

    Thread.sleep(1000)
    println(list.size)


    // var list2 = mutableListOf<Int>() // 변경 지점을 하나만 두자 이렇게 코딩 X
}