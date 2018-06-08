package p03_functions

fun main(args: Array<String>) {

    // Use infix to declare an "operator" function to allow somewhat cleaner code
    // This also happens to be an extension function (see below)
    // In this case, perform a subtraction and return the absolute value of the result
    infix fun Long.absSubtract(input: Long): Long {
        return Math.abs(this - input)
    }

    println(1L absSubtract 5L) // prints positive 4

}