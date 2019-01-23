/**
 * @Author Ajay on 23-01-2019.
 */
class Hamming {

    fun compute(leftString: String, rightString: String): Int {
        require(leftString.length == rightString.length) {
            "Left and right strands are equal"
        }

        return leftString.zip(rightString)
            .count { (left, right) -> left != right }
    }


}