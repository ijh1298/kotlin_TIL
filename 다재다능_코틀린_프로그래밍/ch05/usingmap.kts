val sites = mapOf("pragprog" to "https://www.pragprog.com", "agiledeveloper" to "https://agiledeveloper.com")
println(sites)

println(sites.containsKey("agiledeveloper")) // true
println(sites.containsValue("http://www.example.com")) // false
println(sites.contains("agiledeveloper")) // true
println("agiledeveloper" in sites) // true

// val pragProgSite: String = sites.get("pragprog") 오류 발생
val pragProgSite: String? = sites.get("pragprog")
// get() 메소드는 키가 맵에 없을 경우 nullable 타입을 리턴한다.
val pragProgSite2: String? = sites["pragprog"]

val agiledeveloper = sites.getOrDefault("agiledeveloper", "http://www.example.com")

val sitesWithExample = sites + ("example" to "http://www.example.com")

val withoutAgileDeveloper = sites - "agiledeveloper"

for (entry in sites) {
    println("${entry.key} --- ${entry.value}")
}

// 구조분해
for ((key, value) in sites) {
    println("$key --- $value")
}