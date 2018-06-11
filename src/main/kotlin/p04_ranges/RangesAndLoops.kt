package p04_ranges

fun main(args: Array<String>) {
    someLoops()
}

fun someLoops() {
    val list = listOf(1, 2, 3, 4, 5)
    for (k in list) println(k)

    val set = setOf(6, 7, 8, 9, 10)
    for (k in set) println(k)

    val oneToTen = 1..10
    for (k in oneToTen) {
        for (j in 1..5) {
            println("$j * $k = ${k * j}")
        }
    }
}