/**
 * @Author Ajay on 21-01-2019.
 */
class Pangrams {
    fun main(args: Array<String>) {

        val phrase: String = "Kotlin is great language"
        val result = if (isParagram(phrase) == true) {
            "Given string is paragram"
        } else {
            "Given string is not paragram"
        }

        println(" $result")
    }

    fun isParagram(str: String): Boolean {
        val alphabet = ("a..z").toList()
        return str.fold(alphabet) { remainingLetters, ch ->
            remainingLetters - ch.toLowerCase()
        }.isEmpty()
    }
}
