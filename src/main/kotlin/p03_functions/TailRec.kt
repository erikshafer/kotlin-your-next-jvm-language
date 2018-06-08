package p03_functions

import java.math.BigInteger

// By using `tailrec` keyword, needs correct "form"
// Kotlin optimises away the recursion
// Turns the recursion into a loop when possible
// tailrec
 tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}

fun main(args: Array<String>) {
    println(fib(10000, BigInteger("1"), BigInteger("0")))
}