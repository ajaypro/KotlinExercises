import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @Author Ajay on 30-01-2019.
 */
class scrabbletest {

    @Test
    fun cabbageTest(){
        assertEquals(16, getScrabble("cabbage"))
        println("${getScrabble("cabbage")}")
    }
}