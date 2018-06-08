package p06_objects

// If you need a Singleton you can simply write
// an Object declaration (contrasted with the
// Object expression used above) that will behave
// much like a class with static fields and methods
// in Java.
object MySingleton {
    val aSingletonValue = "ValueA"
    fun aSingletonFunction() {
        println("Yay for Kotlin Objects!")
    }
}

fun main(args: Array<String>) {

    println(MySingleton.aSingletonValue)
    // Prints "ValueA"

    println(MySingleton.aSingletonFunction())
    // Prints "Yay for Kotlin Objects!"
}