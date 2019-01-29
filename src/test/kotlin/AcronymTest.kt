import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * @Author Ajay on 29-01-2019.
 */
class AcronymTest {

    @Test
    fun acronymTest(){
        assertEquals("TLA", acronym("the love affair"))
    }
}