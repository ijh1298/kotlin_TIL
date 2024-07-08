// 배열과 리스트의 반복
val array = arrayOf(1, 2, 3)
for (e in array) { print("$e, ") } // 1, 2, 3,

val list = listOf(1, 2, 3)
print(list.javaClass) // class java.util.Arrays$ArrayList
for (e in list) { print("$e, ") } // 1, 2, 3,

val names = listOf("Tom", "Jerry", " Spike")
for (index in names.indices) {
    println("Position of ${names.get(index)} is $index")
}

for ((index, name) in names.withIndex()) { // 구조분해
    println("Position of $name is $index")
}