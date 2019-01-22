import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


/**
 * @Author Ajay on 22-01-2019.
 */
class panagramtest {

    @Test
    fun emptySentence() {
        assertFalse(Pangram.isPangram(""))
    }

    @Test
    fun lowercasePangram() {
        assertTrue(Pangram.isPangram("the quick brown fox jumps over the lazy dog"))
    }

    @Test
    fun missingCharacterX() {
        assertFalse(Pangram.isPangram("a quick movement of the enemy will jeopardize five gunboats"))
    }

    @Test
    fun anotherMissingCharacterX() {
        assertFalse(Pangram.isPangram("the quick brown fish jumps over the lazy dog"))
    }
}