package p02_properties

// Familiar with data classes? They're in Kotlin!
// Here is a property with how we (ideally) shouldn't
// do it in Kotlin. If you want a custom setter you
// don't define a function.

private var prop: String = "..."
fun getProp() = prop
fun setProp(v: String) {
    println("New value: $v")
    prop = v
}

//private var prop: String = "..."
//set(v) {
//    println("New value: $v")
//    field = v
//}

// If you are familiar with data classes, you will
// be familiar with custom setter syntax.
// Inside it, you have `field` for backend story.
// No need to introduce anything else.