package p01_introduction

data class Customer2(val id: Int,
                     val name: String,
                     var enable: Boolean = true)    // Default parameter value is true.

fun main(args: Array<String>) {

    val sam = Customer2(76, "Sam")                  // Customer1(id=76, name=Sam, enable=true)

    val dan = Customer2(                            // By explicitly stating the property, you
            name = "Dan",                           // can instantiate an object with the parameters
            enable = false,                         // being in any order.
            id = 2)
    dan.enable = true                               // Our first time changing a var. Neat!

    println(sam)
    println(dan)

}