/**
 * @Author Ajay on 29-01-2019.
 */
/**
 * We use fold here which takes the initial value as "" and for lambda invocation it takes the
 * initial value and first element of phrase as "the" and we apply filterindexed to make the first
 * character uppercase and this is done for all words
 */

fun acronym(phrase: String):String =
        phrase.split(*arrayOf(" ","-"))
            .fold(""){acc, word ->
                acc + word.filterIndexed { index, char ->
                    index == 0 || (char.isUpperCase() && word[index -1].isLowerCase())
                }.toUpperCase()
            }