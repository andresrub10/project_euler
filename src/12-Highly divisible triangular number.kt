import helpers.getFactors
import helpers.getTriangleNumber

fun main() {

    var x: Long = 0
    while (true) {

        x++
        print("X= ${x} -> ${getTriangleNumber(x.toInt())}")
        val factors: MutableList<Long> = getFactors(getTriangleNumber(x.toInt()).toLong());
        println(" Factors Size = ${factors.size}")
        if (factors.size > 500) {
            break;
        }
    }
}