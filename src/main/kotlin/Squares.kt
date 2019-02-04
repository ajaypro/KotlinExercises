/**
 * @Author Ajay on 04-02-2019.
 */

data class Squares(val n: Int) {
    private val range = (1..n)

   fun squareOfSum() = range.squareOfSum()
   fun sumOfSquares() = range.sumOfSquares()
   fun difference() = squareOfSum() - sumOfSquares()

}

fun Int.square() = this * this
fun IntRange.squareOfSum() = this.sum().square()
fun IntRange.sumOfSquares() = this.sumBy { it.square() }