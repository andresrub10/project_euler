import helpers.getFibonacciNumber
import helpers.isMultipleOf

fun main() {

    // Suma de los Fibonacci pares menores a 4.000.000

    var sum: Int = 0

    var actualFib: Int = 0
    var fibIndex: Int = 0
    while (actualFib < 4000000) {
        actualFib = getFibonacciNumber(fibIndex)
        val actualFibIsEven = 2.isMultipleOf(actualFib)
        println("El fibonaci numero ${fibIndex} es ${actualFib} y par = ${actualFibIsEven}")

        if (actualFibIsEven) {
            sum = sum + actualFib
        }
        println("Acumulado = $sum \n")

        fibIndex++
    }

    println("Respuesta = $sum")
    //Respuesta = 4613732
}