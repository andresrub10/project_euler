import helpers.getFactors
import helpers.isPrime

fun main() {
    //Cual es el factor primo mas grande de 600851475143


    var longestPrime: Long = 0

    var factors: MutableList<Long> = getFactors(600851475143)

    factors.sort()

    for (i in factors.size - 1 downTo 0) {

        if (factors.get(i).isPrime()) {
            println("Factor primo conseguido = ${factors.get(i)}");
        }
    }

    //Respuesta = 6857


}