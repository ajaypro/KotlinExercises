import java.lang.IllegalArgumentException

/**
 * @Author Ajay on 18-01-2019.
 */



fun transcibeToRNA(dna: String): String =
        dna.fold(""){
            acc, nucleotide ->
            acc + when(nucleotide){
                'G' -> println("G -> C")
                'C' -> 'G'
                'T' -> 'A'
                'A' -> 'U'
                else -> throw IllegalArgumentException("Given DNA characters not present in {G,C,T,A}")
            }
}

fun main(args: Array<String>) {
    transcibeToRNA("GCTA")

}