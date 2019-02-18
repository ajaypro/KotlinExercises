/**
 * @Author Ajay on 18-02-2019.
 */


object Luhn {
    fun isValid(input: String): Boolean {
        val stripped = input.filterNot { it.isWhitespace() }
        if(stripped.length <= 1 || stripped.any { !it.isDigit() }) {
            return false
        }

        
    }
}