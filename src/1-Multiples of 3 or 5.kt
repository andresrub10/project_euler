import helpers.isMultipleOf

fun main() {

    //La suma de todos los multiplos de 3 y 5 menores a mil.

    var sum: Int = 0

    for (i in 1..999) {

        val isMultipleOf3: Boolean = 3.isMultipleOf(i)
        val isMultipleOf5: Boolean = 5.isMultipleOf(i)
        println("$i es multiplo de 3? $isMultipleOf3")
        println("$i es multiplo de 5? $isMultipleOf5")


        if (isMultipleOf3 || isMultipleOf5) {
            sum = sum + i
        }
        println("Acumulado = $sum")
        println()

    }
    println("Respuesta = $sum")

    //Respuesta es 233168
}
