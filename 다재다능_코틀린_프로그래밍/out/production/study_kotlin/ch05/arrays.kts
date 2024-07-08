val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")
println(friends::class) // class kotlin.Array
println(friends.javaClass) // class [Ljava.lang.String;
println("${friends[0]} and ${friends[1]}") // Tintin and Snowy

val numbers1 = arrayOf(1, 2, 3)
println(numbers1::class) // class kotlin.Array
println(numbers1.javaClass) // class [Ljava.lang.Integer; -> Integer 클래스 배열!

val numbers2 = intArrayOf(1, 2, 3)
println(numbers2::class) // class kotlin.IntArray -> int 배열! 오버헤드가 더 적다.
println(numbers2.javaClass) // class [I

println(numbers1.size) // 3
println(numbers2.average()) // 2.0
println(Array(5) { i -> (i + 1) * (i + 1) }.sum()) // 55