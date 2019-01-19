import org.junit.Test
import kotlin.test.assertEquals


/**
 * @Author Ajay on 18-01-2019.
 */
class TransciptTest {

    @Test
    fun rnaTranscript(){
        assertEquals("GCTACTGCA", transcibeToRNA("CGAUGACGU"))
    }
}