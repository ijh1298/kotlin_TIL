package ch03

// 명시적 아큐먼트를 이용한 가독성 향상
fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
    println("$name $age $height $weight")
}

createPerson("Jake", 12, 152, 43)
createPerson(name = "Jake", age = 12, weight = 43, height = 152) // 명시적!

