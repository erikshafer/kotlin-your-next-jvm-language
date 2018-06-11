package p05_kotlinStandardLibrary

fun main(args: Array<String>) {

    val dirtyData = mapOf("1" to "foo", "2" to "bar", "baz" to "qux")

    val cleanData = dirtyData
            .filterKeys { it.toIntOrNull() != null }
            .mapKeys { it.key.toInt() }

    println(cleanData)

// {1=foo, 2=bar}

}