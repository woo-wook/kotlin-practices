package conventions

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class ObservableProperty(
    /*val propName: String, */
    var propValue: Int, val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(emp: Employee, prop: KProperty<*>): Int = propValue
    operator fun setValue(emp: Employee, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

class Employee(
    val name: String, age: Int, salary: Int
): PropertyChangeAware() {
//    var age: Int = age
//        set(newValue) {
//            val oldValue = field
//            field = newValue
//
//            changeSupport.firePropertyChange("age", oldValue, newValue)
//        }
//
//    var salary: Int = salary
//        set(newValue) {
//            val oldValue = field
//            field = newValue
//
//            changeSupport.firePropertyChange("salary", oldValue, newValue)
//        }

//    val _age = ObservableProperty("age", age, changeSupport)
//
//    var age: Int
//        get() = _age.getValue()
//        set(value)  { _age.setValue(value) }
//
//    val _salary = ObservableProperty("salary", salary, changeSupport)
//
//    var salary: Int
//        get() = _salary.getValue()
//        set(value) { _salary.setValue(value) }
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)
}

fun main() {
    val emp = Employee("Dmitry", 34, 500000)

    emp.addPropertyChangeListener {
        event -> println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}")
    }

    emp.age = 35
    emp.salary = 600000
}