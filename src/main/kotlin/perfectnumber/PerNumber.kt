package perfectnumber

/**
 * @Author Ajay on 07-02-2019.
 */


/**
 * Determine if a number is perfect, abundant, or deficient based on Nicomachus' (60 - 120 CE)
 * classification scheme for natural numbers.
 *
 * aliquot sum: s(n) of a positive integer n is the sum of all proper divisors of n, that is, all divisors of n other than n itself
 * Perfect: aliquot sum = number
 * Abundant: aliquot sum > number
 * Deficient: aliquot sum < number
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

/*
 * Find all divisors of a natural number, n, including itself.
 */

fun Int.divisors() = (1..this).filter { this.isDivisorOf(this) }
fun Int.perfectDivisors() = this.divisors()
fun Int.aquilotSum() = this.perfectDivisors().sum()
fun Int.isDivisorOf(n:Int):Boolean = (n.rem(this)) == 0