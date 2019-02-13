package secret

/**
 * @Author Ajay on 06-02-2019.
 */

/**
 * Given the input 3, the function would return the array ["wink", "double blink"] because 3 is 11 in binary.
Given the input 19, the function would return the array ["double blink", "wink"] because 19 is 10011 in binary.
Notice that the addition of 16 (10000 in binary) has caused the array to be reversed.
 */
object calculator {

    private val REVERSE_BIT_FLAG = 0b0001_0000

    fun calculate(num: Int): List<signal>{
        val handSignals = (signal.values()).fold(emptyList<signal>()){
            acc, signal ->
            if(num.hasBitFlagSet(signal.bitFlag)){
                acc + signal
            } else {
                acc
            }
        }
        return if(num.hasBitFlagSet(REVERSE_BIT_FLAG)) handSignals.reversed() else handSignals
    }
}

fun Int.hasBitFlagSet(bitFlag: Int): Boolean = (this and bitFlag) != 0