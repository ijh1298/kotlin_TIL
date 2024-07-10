/**
 * 코틀린의 클래스는 디폴트가 final이다.
 * open이라고 명시된 클래스로부터만 상속을 받을 수 있다.
 */

open class Vehicle(val year: Int, open var color: String) {
    open val km = 0
    final override fun toString() = "year : $year, Color : $color, KM : $km"
    fun repaint(newColor: String) {
        color = newColor
    }
}

// Java와 다르게 implements, extends를 구분하지 않는다. 그냥 상속(inheritance)라고 표현
open class Car(year: Int, color: String): Vehicle(year, color) {
    override var km: Int = 0
        set(value) {
            if (value < 1) {
                throw RuntimeException("can't set negative value")
            }
            field = value
        }
    fun drive(distance: Int) {
        km += distance
    }
}

val car = Car(2019, "Orange")
println(car.year)   // 2019
println(car.color)  // Orange
car.drive(10)
println(car)        // year: 2019, Color: Orange, KM : 10
try {
    car.drive(-30)
} catch (ex: RuntimeException) {
    println(ex.message) // can't set negative value
}

/**
 * Car 클래스를 부모로 자식 클래스를 생성할 수도 있다.
 * FamilyCar 클래스는 Car 클래스를 확장한 클래스이다.
 */
class FamilyCar(year: Int, color: String): Car(year, color) {
    override var color: String
        get() = super.color
        set(value) {
            if (value.isEmpty()) {
                throw RuntimeException("Color Required")
            }
            super.color = value
        }
}

val familyCar = FamilyCar(2019, "Green")
println(familyCar.color)    // Green
try {
    familyCar.repaint("")
} catch (ex: RuntimeException) {
    println(ex.message)     // Color required
}