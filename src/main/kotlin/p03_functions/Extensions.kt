package p03_functions

fun main(args: Array<String>) {
    val text = "With   multiple \t whitespace"
    println(replaceMultipleWhiteSpace(text))
}

fun replaceMultipleWhiteSpace(value: String): String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}


//fun main(args: Array<String>) {
//    val text = "With   multiple \t whitespace"
//    println(text.replaceMultipleWhiteSpace())
//}
//
//fun String.replaceMultipleWhiteSpace(): String {
//    var regex = Regex("\\s+")
//    return regex.replace(this, " ")
//}

// kotlinlangorg ---> Extensions
// Kotlin, similar to C# and Gosu, provides the ability to
// extend a class with new functionality without having to
// inherit from the class or use any type of design pattern
// such as Decorator. This is done via special declarations
// called extensions. Kotlin supports extension functions
// and extension properties.