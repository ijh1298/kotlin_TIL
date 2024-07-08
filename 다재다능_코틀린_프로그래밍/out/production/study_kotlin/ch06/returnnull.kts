fun nickName(name: String?): String? {
    if (name == "William") {
        return "Bill"
    }
    /*
    1, 2는 동일한 표현 방식
1   return name?.reversed()
    ?는 세이프 콜 연산자(safe-call operator)로서 null일 경우 null을 반환하고, null이 아닐 경우 연산결과를 반환
2   if (name != null)
        return name.reversed()
    return null
    */
    return name?.reversed()?.toUpperCase() ?: "Joker"
    // ?: Elvis 연산자
    // null 이면 "Joker"를 반환하라
}
fun whenNickName(name: String?) = when (name) {
    "William" -> "Bill"
    null -> "Joker"
    else -> name.reversed().toUpperCase()
}

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")