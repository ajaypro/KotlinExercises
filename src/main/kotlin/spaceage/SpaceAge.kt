package spaceage

import spaceage.Planet.*

/**
 * @Author Ajay on 27-01-2019.
 */
data class SpaceAge(val ageInSeconds: Int) {
    var seconds = ageInSeconds

    fun spaceAge(planet: Planet):Double =
        ageInSeconds/planet.orbitalPeriod

    fun onEarth() = spaceAge(EARTH)


}