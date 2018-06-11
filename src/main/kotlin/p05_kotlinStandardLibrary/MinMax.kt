package p05_kotlinStandardLibrary

fun main(args: Array<String>) {

    val list1 = listOf("a", "b")
    val list2 = listOf("x", "y", "z")
    val minSize = minOf(list1.size, list2.size)
    val longestList = maxOf(list1, list2, compareBy { it.size })

    println("Minimum: $minSize")
    println("Longest: $longestList")

}

// Additions such as minOf and MaxOf are newer
// additions to the Kotlin Standard Library (1.1).