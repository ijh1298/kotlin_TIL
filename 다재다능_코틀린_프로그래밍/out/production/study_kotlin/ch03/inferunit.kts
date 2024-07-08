package ch03/*
fun sayHello() = println("Well, hello")
val message: String = sayHello() // ERROR
// type mistmatch : inferred type is Unit but String was expected
*/
fun sayHello() = println("Well, hello")
val message: Unit = sayHello()
println("The result of sayHello is $message")