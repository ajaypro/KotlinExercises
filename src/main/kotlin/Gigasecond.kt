import java.time.LocalDateTime

/**
 * @Author Ajay on 25-01-2019.
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