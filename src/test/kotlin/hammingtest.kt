import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import kotlin.test.assertEquals

/**
 * @Author Ajay on 23-01-2019.
 */
class hammingtest {

    @Rule
    @JvmField
    var expectedException: ExpectedException = ExpectedException.none()
    val hamming = Hamming()
    @Test
    fun noDistanceBetweenEmptyStrands() {
        assertEquals(0, hamming.compute("", ""))
    }

    @Test
    fun noDistanceBetweenShortIdenticalStrands() {
        assertEquals(0, hamming.compute("A", "A"))
    }
}