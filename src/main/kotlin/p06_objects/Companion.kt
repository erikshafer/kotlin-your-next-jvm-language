package p06_objects

// Objects can be used as Companions in Kotlin classes
// to add static-like properties and functions to the
// class. The Companion will be constructed only once
// and shared amongst all instances of the containing
// class.
class ClassWithCompanion {
    companion object {
        fun PrintAMessage() {
            println("I'm a function in the Companion!")
        }
    }
}

fun main(args: Array<String>) {
    ClassWithCompanion.PrintAMessage()
    // Note the 'static' access. Prints:
    // "I'm a function in the Companion!"
}