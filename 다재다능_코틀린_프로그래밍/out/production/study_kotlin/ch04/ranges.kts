// Range Class
val oneToFive: IntRange = 1..5
val aToE: CharRange = 'a'..'e'
val seekHelp: ClosedRange<String> = "hell".."help" // "12-2 서드파티 클래스 인젝팅에서 다룸"
println(seekHelp.contains("helm")) // true
println(seekHelp.contains("helq")) // false

for (i in 1..5) { print("$i, ") }
for (ch in 'a'..'e') { print(ch) }