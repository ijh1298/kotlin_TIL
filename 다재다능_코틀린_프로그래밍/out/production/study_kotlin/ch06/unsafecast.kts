fun fetchMessage(id: Int): Any =
    if (id == 1) "Record found" else StringBuilder("data not found")

//for (id in 1..2) {
//    println("Message length: ${(fetchMessage(id) as String).length}")
//}

for (id in 1..2) {
    println("Message length: ${(fetchMessage(id) as? String)?.length ?: "---"}")
}
// as? 연산자는 캐스팅이 실패하면 null을 할당