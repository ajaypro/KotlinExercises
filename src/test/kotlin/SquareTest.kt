import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @Author Ajay on 04-02-2019.
 */
class SquareTest {

    @Test
    fun squareOfSum10() {
        assertEquals(3025,Squares(10).squareOfSum())
    }

    @Test
    fun squareOfSum5() {
        assertEquals(225, Squares(5).squareOfSum())
    }

    @Test
    fun squareOfSum100() {
        assertEquals(25502500, Squares(100).squareOfSum())
    }

    @Test
    fun sumOfSquares5() {
        assertEquals(55, Squares(5).sumOfSquares())
    }
}