/**
 * @Author Ajay on 08-02-2019.
 */

object sumOfMultiples {

     fun sum(factors: Set<Int>, endExclusive: Int) =
         (1 until endExclusive).sumBy { n ->
             if (factors.any { n.isMultipleOf(it) }) n
             else 0
     }
}

fun Int.isMultipleOf(num: Int): Boolean = this%num == 0


















