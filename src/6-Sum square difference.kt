fun main() {


    var sumOfSquares: Long = 0;
    var sum: Long = 0;
    var squareOfSums: Long;

    for (i in 1..100) {
        sum = sum + i

        sumOfSquares = sumOfSquares + (i * i)

    }

    squareOfSums = sum * sum

    println("Respuesta = ${squareOfSums - sumOfSquares}")
    //respuesta = 25164150
}