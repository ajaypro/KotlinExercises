import org.junit.Test
import perfectnumber.classification
import perfectnumber.perfNumber
import kotlin.test.assertEquals

/**
 * @Author Ajay on 07-02-2019.
 */
class PerNumberTest {

    @Test
    fun naturalNumberTest(){
        assertEquals(classification.ABUNDANT, perfNumber(60))
    }
}