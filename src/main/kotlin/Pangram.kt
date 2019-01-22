/**
 * @Author Ajay on 22-01-2019.
 */
class Pangram {

    fun main(args: Array<String>) {

        val phrase: String = "Kotlin is great language"
        val result = if (isPangram(phrase) == true) {
            "Given string is paragram"
        } else {
            "Given string is not paragram"
        }

        println(" $result")
    }

    companion object {


        fun isPangram(str: String): Boolean {
            val alphabet = ("a..z").toList()
            return str.fold(alphabet) { remainingLetters, ch ->
                remainingLetters - ch.toLowerCase()
            }.isEmpty()
        }
    }
}