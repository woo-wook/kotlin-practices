package abstraction

class CoffeeMachine {
    fun makeCoffee() {
        boilWater()
        brewCoffee()
        pourCoffee()
        pourMilk()
    }

    fun makeEspressoCoffee() {
        boilWater()
        brewCoffee()
        pourCoffee()
    }

    fun boilWater() { }
    fun brewCoffee() { }
    fun pourCoffee() { }
    fun pourMilk() { }
}