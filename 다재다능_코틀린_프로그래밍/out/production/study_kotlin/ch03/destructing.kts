package ch03

fun getFullName() = Triple("John", "Quincy", "Adams")
// Triple : 튜플을 구현하는 코틀린 스탠다드 라이브러리
/*
val result = getFullName()
val first = result.first
val middle = result.second
val last = result.third
println("$first $middle $last") // John Quincy Adams
*/
val (first, middle, last) = getFullName()
println("$first $middle $last") // John Quincy Adams
// val (_, _, last) = getFullName()
// _ (언더스코어)를 통해 속성을 스킵할 수 있음

