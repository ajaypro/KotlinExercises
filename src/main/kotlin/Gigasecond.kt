import java.time.LocalDateTime

/**
 * @Author Ajay on 25-01-2019.
 *
 * Calculate the moment when someone has lived for 10^9 seconds.
A gigasecond is 10^9 (1,000,000,000) seconds.
 */
class Gigasecond {


    companion object {

        fun gigasecond(dob: LocalDateTime): LocalDateTime {
            val gSecond = Math.pow(10.0, 9.0).toLong()
            val date = dob.plusSeconds(gSecond)

            return date
        }
    }
}