/**
 * @Author Ajay on 02-02-2019.
 */


fun rainsound(number: Int) : String =
        buildString {
            if(number % 3 == 0) append("Pling")
            if(number % 5 == 0) append("Plang")
            if(number % 7 == 0) append("Plong")
            if(length == 0) append(number)
        }
