package p05_kotlinStandardLibrary

fun main(args: Array<String>) {

    Pair("foo", "bar")
    Triple(1, "wom", "bat")

    val (foo, one) = someFunction()
    println("Foo: $foo")
    println("One: $one")
}

fun someFunction(): Pair<String, Int> = Pair("foo", 1)


