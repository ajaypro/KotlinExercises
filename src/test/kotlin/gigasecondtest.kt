import java.time.LocalDateTime
import java.time.Month
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @Author Ajay on 25-01-2019.
 */
class gigasecondtest {

    @Test
    fun modernTime() {
        val sec = Gigasecond.gigasecond(LocalDateTime.of(1999,Month.AUGUST,21,23,10))
        assertEquals(LocalDateTime.of(1999,Month.AUGUST,21,23,10),sec)
    }
}