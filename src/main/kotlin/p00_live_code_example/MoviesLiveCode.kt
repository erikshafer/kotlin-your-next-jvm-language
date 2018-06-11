package p00_live_code_example

// Data classes implemented toString, equals, and other methods.
// Establish your constructor via parameters.
// Avoid nullable variables to mitigate NPE likelihood.
// Default parameters are your friend!
data class Movie(var name: String?,
                 val year: Int,
                 var genre: String = "")

// Using a when (switch++) through a function expression.
fun convertGenreCode(m: Movie): String = when (m.genre) {
    "SCF" -> "Science Fiction"
    "ACT" -> "Action"
    "CMD" -> "Comedy"
    else -> throw IllegalArgumentException("Unacceptable genre code")
}

// While just about everything is public in Kotlin by default,
// private methods are possible!
private fun outputMovieList(movies: List<Movie>) {
    movies.forEach {
        println(convertGenreCode(it))
    }
}

fun main(args: Array<String>) {
    // String interpolation
    val neCode = "Nebraska.Code!"
    println("Hello, $neCode")

    val starWars = Movie("Star Wars", 1977)
    // Default param var allows us to update this later.
    // Mitigate those legacy system issues!
    starWars.genre = "SCF"

    // Construct values in any order.
    val dieHard = Movie(
            year = 1989,
            genre = "ACT",
            name = "Dis Hard")

    val grndHog = Movie("Groundhog's Day", 1993, "CMD")
//    grndHog.year = 1933 // Values (val) cannot be reassigned.

    // Immutable list of Movies.
    val movies = listOf(starWars, dieHard, grndHog)

    // Iterate through each Movie and print the converted genre value.
    outputMovieList(movies)

    // If is expressive in Kotlin. `==` is an infix for `equals()`
    val message = if (starWars == dieHard) {
        "Movies are equal"
    } else {
        "Movies are not equal"
    }
    println("Are the movies equal? $message")

}