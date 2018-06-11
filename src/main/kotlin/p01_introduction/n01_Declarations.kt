package p01_introduction

fun main(args: Array<String>) {

    val immutable = "Read-only value. Val is preferred over var when possible."
    var mutable   = "Mutable variable."

    var someVar : String? = null        // Declare a mutable null value

//    someVar.length                    // Rejected by compiler. Can be null!

    if (someVar != null) {              // Not okay. Value could have been changed
        someVar.length                  // very quickly somehow.
    }

    someVar?.length                     // Null-safe traversal. Results in `length` or `null`.

    someVar?.length ?: "Default value"  // ELVIS OPERATOR. Results in length or `Default value`.
                                        // Think of this like Kotlin's ternary operator.
}