import org.junit.Test
import kotlin.test.assertEquals


/**
 * @Author Ajay on 18-01-2019.
 */
class TransciptTest {

    @Test
    fun cytosineComplementIsGuanine() {
        assertEquals("G", transcibeToRNA("C"))
    }

    @Test
    fun guanineComplementIsCytosine() {
        assertEquals("C", transcibeToRNA("G"))
    }

    @Test
    fun thymineComplementIsAdenine() {
        assertEquals("A", transcibeToRNA("T"))
    }

    @Test
    fun adenineComplementIsUracil() {
        assertEquals("U", transcibeToRNA("A"))
    }

    @Test
    fun rnaTranscript(){
        assertEquals("GCTACTGCA", transcibeToRNA("CGAUGACGU"))
    }
}