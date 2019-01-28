package spaceage

import spaceage.Planet.*
import java.math.BigDecimal

/**
 * @Author Ajay on 27-01-2019.
 */
data class SpaceAge(val ageInSeconds: Int) {
    var seconds = ageInSeconds

    fun spaceAge(planet: Planet):Double =
        secondsToYear( ageInSeconds/planet.orbitalPeriod).roundedTo(2)

    fun onEarth() = spaceAge(EARTH)
    fun onMercury() = spaceAge(MERCURY)
    fun onVenus()   = spaceAge(VENUS)
    fun onMars()    = spaceAge(MARS)
    fun onJupiter() = spaceAge(JUPITER)
    fun onSaturn()  = spaceAge(SATURN)
    fun onUranus()  = spaceAge(URANUS)
    fun onNeptune() = spaceAge(NEPTUNE)



    companion object TimeUtils{
        private fun toMin(s: Double) = s/60.0
        private fun toHour(min: Double) = min/60.0
        private fun toDay(hr: Double) = hr/24
        private fun toYear(day: Double) = day/365.25

        fun secondsToYear(s:Double): Double = toYear(toDay(toHour(toMin(s))))

        fun Double.roundedTo(decimal: Int): Double  =
            BigDecimal(this).setScale(decimal, BigDecimal.ROUND_HALF_UP).toDouble()
    }


}