package p01_introduction

// The `data` keyword brings in methods to a class that many developers
// implement via IDEs. Kotlin reduces boilerplate code generation and helps
// make the code more maintainable without hav

data class Customer1(val id: Int, val name: String)

fun main(args: Array<String>) {
    val bob = Customer1(42, "Bob")

    println(bob)                        // Customer1(id=42, name=Bob)
    println(bob.toString())             // Customer1(id=42, name=Bob)

    val copy: Customer1 = bob.copy()    // Build duplicate of `bob`

    println( bob == copy )              // True. All the property values were equal.
    println( bob === copy )             // False. Not referentially equal.

    val (id, name) = bob                // Destructuring.
    println(id)                         // 42
    println(name)                       // Bob

}