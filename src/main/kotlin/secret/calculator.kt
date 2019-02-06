package secret

/**
 * @Author Ajay on 06-02-2019.
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