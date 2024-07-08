open class Fruit
class Banana : Fruit()
class Orange : Fruit()

fun receiveFruits1(fruits: Array<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}
fun receiveFruits2(fruits: List<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}

val bananas1: Array<Banana> = arrayOf()
// receiveFruits1(bananas1) => Error : type mismatch

val bananas2: List<Banana> = listOf()
receiveFruits2(bananas2)
// 가능한 이유?
// 뮤터블 Array<T>는 class Array<T>
// 이뮤터블 List<T>는 interface List<Out E> 로 정의되기 때문이다.