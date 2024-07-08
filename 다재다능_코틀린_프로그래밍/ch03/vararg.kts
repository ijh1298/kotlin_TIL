package ch03

// 여러 개의 인자
fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }
    return large
}
println(max(1, 5, 2)) // 5
println(max(1, 5, 2, 12, 7, 3)) // 12

fun greetMany(msg: String, vararg names: String) {
    println("$msg ${names.joinToString(", ")}")
}
greetMany("Hello", "Tom", "Jerry", "Spike") //Hello Tom, Jerry, Spike

val values = intArrayOf(1, 21, 3)
// print(max(values)) - ERROR
print(max(values[0], values[1], values[2])) // not good...
print(max(*values)) // 스프레드 연산자를 이용!
print(max(*listOf(1, 4, 18, 12).toIntArray())) // 리스트를 배열로 변환하고, 배열을 스프레드 연산자로 하나씩 vararg로 전달하는 형태