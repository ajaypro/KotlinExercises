package perfectnumber

/**
 * @Author Ajay on 07-02-2019.
 */


    enum class classification {
    DEFICIENT, PERFECT, ABUNDANT
}

    fun perfNumber(num: Int):classification {
        require(num > 1)
        val aquilotSum = num.aquilotSum()

        return when {
            aquilotSum == num -> classification.PERFECT
            aquilotSum > num -> classification.ABUNDANT
            else ->
                classification.DEFICIENT


        }
    }

fun Int.divisors() = (1..this).filter { this.isDivisorOf(this) }
fun Int.perfectDivisors() = this.divisors()
fun Int.aquilotSum() = this.perfectDivisors().sum()
fun Int.isDivisorOf(n:Int):Boolean = (n.rem(this)) == 0