package p05_kotlinStandardLibrary

fun main(args: Array<String>) {

    val items = listOf(1, 2, 3, 4)
    items.groupBy { if (it % 2 == 0) "even" else "odd" }
    // {odd=[1, 3], even=[2, 4]}


    items.associate { (if (it % 2 == 0) "greatest_even" else "greatest_odd") to it }
    // {greatest_odd=3, greatest_even=4}

}