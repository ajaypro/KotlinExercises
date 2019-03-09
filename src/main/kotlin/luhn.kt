/**
 * @Author Ajay on 18-02-2019.
 */


object Luhn {
    fun isValid(input: String): Boolean {
        val stripped = input.filterNot { it.isWhitespace() }
        if (stripped.length <= 1 || stripped.any { !it.isDigit() }) {
            return false
        }

        return stripped.map { it.toString().toInt() }
            .foldRight(emptyList<Int>()) { n, acc ->
                /* if the accumulator size is odd, this is an even-indexed element (from right) */
                if (acc.size % 2 == 1) acc + doubleAndReduce(n)
                else acc + n
            }.sum()
            .isMultiplesOf(10)
    }

    private fun doubleAndReduce(n: Int) =
        if ((n * 2) > 9) {
            (n * 2) - 9
        } else {
            (n * 2)
        }
    }


fun Int.isMultiplesOf(num: Int) = this % num == 0