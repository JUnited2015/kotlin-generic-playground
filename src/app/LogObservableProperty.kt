package app

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * Jika ingin mengecek perubahan sebelum dan sesudah, bisa menggunakan ObservableProperty
 * tanpa menggunakan ReadWriteProperty
 */
class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param) {

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
}

fun main() {
    val car = Car("Honda", 2020)

    car.brand = ""
    println(car.brand)

    car.year = 2021
    println(car.year)
}