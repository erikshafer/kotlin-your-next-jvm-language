package p05_kotlinStandardLibrary

fun main(args: Array<String>) {

    val mySet = setOf(1, 2, 3, 4, 5, 6)
    val union = mySet.union(setOf(7, 8, 9))
    // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    val intersection = mySet.intersect(setOf(3, 4, 5, 11, 12))
    // [3, 4, 5]

    val difference = mySet.subtract(setOf(1, 2, 3))
    // [4, 5, 6]

    val drop = mySet.drop(4)
    // [5, 6], reverse limit (SQL)


    val myList = listOf(1, 2, 3, 4, 5, 6)
    myList.dropWhile { it < 5 }
    // [5, 6]

    myList.dropLastWhile { it > 3 }
    // [1, 2, 3]

}