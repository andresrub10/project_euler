import helpers.isMultipleOf

fun main() {

    var smallestMultiple: Int = 20 * 19
    while (true) {

        var satisfiesEveryCase: Boolean = true
        for (i in 1..20) {
            var isMultiple: Boolean = i.isMultipleOf(smallestMultiple)
            println("Probando que ${i} es multiplo de ${smallestMultiple} => ${isMultiple}")
            if (!isMultiple) {
                satisfiesEveryCase = false
                break;
            }
        }

        if (satisfiesEveryCase) {
            return;
        }

        smallestMultiple = smallestMultiple + (20 * 19)
    }

    println("Respuesta =  ${smallestMultiple}")


}