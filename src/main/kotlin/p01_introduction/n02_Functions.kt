package p01_introduction

// Here are top-level functions that are not bound to a class.

fun sum(x: Int, y: Int) { x + y }

fun multi(a: Int, b: Int) { a * b }

fun main(args: Array<String>) {
    val four = sum(2, 2)    // 4
    val six  = multi(3, 2)  // 6
}