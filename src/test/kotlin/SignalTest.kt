import org.junit.Test
import secret.calculator
import secret.signal
import kotlin.test.assertEquals

/**
 * @Author Ajay on 06-02-2019.
 */

class SignalTest {

    @Test
    fun testAwink(){
        assertEquals(listOf(signal.WINK), calculator.calculate(1))
    }
}