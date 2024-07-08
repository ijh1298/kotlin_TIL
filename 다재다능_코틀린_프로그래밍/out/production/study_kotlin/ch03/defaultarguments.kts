package ch03

fun greet1(name: String, msg: String = "Hello"): String = "$msg $name"
println(greet1("Eve")) //Hello Eve
println(greet1("Eve", "Howdy")) //Howdy Eve

fun greet2(name: String, msg: String = "Hi ${name.length}") = "$msg $name"
println(greet2("Scott", "Howdy")) // Howdy Scott
println(greet2("Scott")) // Hi 5 Scott