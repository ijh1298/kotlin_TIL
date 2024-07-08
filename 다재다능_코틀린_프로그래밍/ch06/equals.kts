class Animal {
    // override operator 연산자 오버로딩
    // == equals, ++ inc, -- dec 와 같은 method의 역할을 바꿀 수 있음
    override operator fun equals(other: Any?) = other is Animal
}

val greet: Any = "hello"
val odie: Any = Animal()
val toto: Any = Animal()
println(odie == greet) // false
println(odie == toto) // true