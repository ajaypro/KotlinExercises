import org.junit.Test
import spaceage.SpaceAge
import kotlin.test.assertEquals

/**
 * @Author Ajay on 27-01-2019.
 */
class SpaceAgeTest {

    @Test
    fun ageInSeconds() {
        val age = SpaceAge(100000)
        assertEquals(31.69, age.onEarth())
    }
}