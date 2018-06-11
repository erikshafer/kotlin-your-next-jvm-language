package p00_live_code_example

// You don't need a lot of syntax to create a class and establish properties.
class SimpleClass(text: String)

// No `public static void main` here. It's just a simple function.
// With type inference we don't need the `new` keyword.
fun main(args: Array<String>) {
    val todo = SimpleClass("This is pretty simple!")
    println(todo)
}