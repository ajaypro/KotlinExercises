import org.junit.Test
import kotlin.test.assertFalse

/**
 * @Author Ajay on 09-03-2019.
 */
class LuhnTest {

    @Test
    fun singleDigitStringsCannotBeValid() {
        assertFalse(Luhn.isValid("1"))
    }
}