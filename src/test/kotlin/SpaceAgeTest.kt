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
        assertEquals(100000, age.seconds)
    }

    @Test
    fun ageOnEarth(){
        val age = SpaceAge(100000000)
        assertEquals(31.69,age.onEarth())
    }

    @Test
    fun ageOnMercury(){
        val age = SpaceAge(231432123)
        assertEquals(280.88,age.onMercury())
    }

    @Test
    fun ageOnVenus() {
        val age = SpaceAge(189839836)

        assertEquals(6.02, age.onEarth())
        assertEquals(9.78, age.onVenus())
    }

    @Test
    fun ageOnMars() {
        val age = SpaceAge(232987123)

        assertEquals(73.83, age.onEarth())
        assertEquals(39.25, age.onMars())
    }
}