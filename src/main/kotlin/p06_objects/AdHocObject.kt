package p06_objects

// Object is a special type in Kotlin that is very
// different from Java’s Object base type. Object is a
// versatile construct that can be used much like ad-hoc
// objects in JavaScript, easily build a Singleton, or
// add static-like capabilities to your Kotlin classes.

// Object can be used to generate on-the-fly structures
// without going through the work of defining a class.
// When used as part of an expression like this the
// Object is evaluated as the line is executed which
// contrasts with other uses of Object that are
// initialized the first time they are referenced.

fun main(args: Array<String>) {

    val adhoc = object {
        val first = "firstValue"
        val second = "secondValue"
    }
    println("${adhoc.first}, ${adhoc.second}")
    // Prints "firstValue, secondValue"

}