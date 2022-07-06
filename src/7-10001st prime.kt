import helpers.isPrime

fun main() {


    var foundPrimes: Int = 0;
    var actual: Long = 0;

    while (foundPrimes < 10001) {
        actual++
        if (actual.isPrime()) {
            foundPrimes++
            println("Found prime number ${foundPrimes}: ${actual}")
        }
    }



    println("Respuesta = ${actual}")
    //Respuesta = 104743
}