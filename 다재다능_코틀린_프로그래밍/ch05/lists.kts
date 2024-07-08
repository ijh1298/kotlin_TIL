val fruits: List<String> = listOf("Apple", "Banana", "Grape")
println(fruits)

println(fruits.contains("Apple")) // true
println("Apple" in fruits) // true

val fruits2 = fruits + "Orange"
println(fruits) // [Apple, Banana, Grape]
println(fruits2) // [Apple, Banana, Grape, Orange] -> 기존 리스트를 카피하면서 새로운 리스트를 만들고 새로운 요소를 추가한다!

val noBanana = fruits - "Banana"
println(noBanana) // [Apple, Grape]
