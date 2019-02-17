/**
 * @Author Ajay on 02-02-2019.
 *
 *
 * Convert a number to a string, the contents of which depend on the number's factors.

If the number has 3 as a factor, output 'Pling'.
If the number has 5 as a factor, output 'Plang'.
If the number has 7 as a factor, output 'Plong'.
 */


fun rainsound(number: Int) : String =
        buildString {
            if(number % 3 == 0) append("Pling")
            if(number % 5 == 0) append("Plang")
            if(number % 7 == 0) append("Plong")
            if(length == 0) append(number)
        }

fun main(args: Array<String>) {

    println(rainsound(56))
}