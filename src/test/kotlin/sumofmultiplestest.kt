import org.junit.Test
import kotlin.test.assertEquals

/**
 * @Author Ajay on 08-02-2019.
 */
class sumofmultiplestest {

    @Test
    fun `multiples of 3 or 5 up to 1`() {
        assertEquals(0, sumOfMultiples.sum(setOf(3, 5), 1))
    }
}