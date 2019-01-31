/**
 * @Author Ajay on 30-01-2019.
 */

// Get scrabble score of a word
fun getScrabble(word: String): Int = word.sumBy { it -> valueOf(it) }

private fun valueOf(letter: Char): Int  =

    when(letter.toUpperCase()) {
        'A','E','I','G','w' -> 1
        'T','R','H'         -> 2
        'Z','D','F','X'     -> 4
        'J','K','L','B'     -> 6
        else                -> 0
    }


