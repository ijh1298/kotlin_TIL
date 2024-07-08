class Animal(val age: Int) {
    override operator fun equals(other: Any?): Boolean {
        return if (other is Animal) age == other.age else false
        /*
        Java에서는
        if (other instanceof Animal) {
            return age == ((Animal) other.age);}
        other이 Animal 클래스임을 알아도, other.age를 비교하려면 Cast를 해야 한다.

        Kotlin에서는 smart cast로 그러지 않아도 된다.
         */
    }
}

val odie = Animal(2)
val toto = Animal(2)
val butch = Animal(3)
println(odie == toto) // true
println(odie == butch) // false