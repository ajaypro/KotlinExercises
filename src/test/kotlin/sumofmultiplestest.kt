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

    @Test
    fun `multiples of 3 or 5 up to 4`() {
        assertEquals(3, sumOfMultiples.sum(setOf(3, 5), 4))
    }

    @Test
    fun `multiples of 3 or 5 up to 10`() {
        assertEquals(23, sumOfMultiples.sum(setOf(3, 5), 10))
    }

    @Test
    fun `multiples of 3 or 5 up to 20`() {
        assertEquals(78, sumOfMultiples.sum(setOf(3, 5), 20))
    }

    @Test
    fun `multiples of 3 or 5 up to 50`() {
        assertEquals(78, sumOfMultiples.sum(setOf(3, 5), 50))
    }

    @Test
    fun `multiples of 3 or 5 up to 30`() {
        assertEquals(78, sumOfMultiples.sum(setOf(3, 5), 50))
    }

    @Test
    fun `multiples of 3 or 5 up to 100`() {
        assertEquals(2318, sumOfMultiples.sum(setOf(3, 5), 100))
    }
}