import org.junit.Test
import secret.Calculator
import secret.signal
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * @Author Ajay on 06-02-2019.
 */

class SignalTest {

    @Test
    fun testAwink(){
        assertEquals(listOf(signal.WINK), Calculator.calculate(1))
    }

    @Test
    fun singleZeroIsInvalid() {
        assertFalse(Luhn.isValid("0"))
    }

    @Test
    fun simpleValidSINThatRemainsValidIfReversed() {
        assertTrue(Luhn.isValid("059"))
        assertTrue(Luhn.isValid("950"))
    }
}