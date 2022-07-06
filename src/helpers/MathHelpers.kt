package helpers

import java.math.BigInteger

inline fun Int.isMultipleOf(x: Int): Boolean {
    if (x == 0) return true
    return x % this == 0
}

inline fun Long.isMultipleOf(x: Long): Boolean {
    if (x == 0L) return true
    return x % this == 0L
}

inline fun Long.isPrime(): Boolean {

    if (this == 1L) {
        return false
    }

    var stopVariable: Long = this - 1
    var i: Long = 2
    while (i < stopVariable) {
        if (i.isMultipleOf(this)) {
            return false
        }
        stopVariable = (this / i)
        i++
    }
    return true
}

val foundFibNumbers = LinkedHashMap<Int, Int>();
fun getFibonacciNumber(x: Int): Int {

    if (x == 0)
        return 0
    if (x == 1)
        return 1
    if (x == 2)
        return 2


    return foundFibNumbers.getOrPut(x) { getFibonacciNumber(x - 2) + getFibonacciNumber(x - 1) }
}

fun getFactors(x: Long): MutableList<Long> {

    val output: MutableList<Long> = mutableListOf()

    var stopVariable: Long = x
    var i: Long = 1
    while (i < stopVariable) {
        if (i.isMultipleOf(x)) {
            if (i == x / i) {
                output.add(i)
            } else {
                output.add(i)
                output.add(x / i)

            }
            stopVariable = (x / i) - 1
        }
        i++
    }
    return output
}

val foundTriangleNumbers = LinkedHashMap<Int, Int>();
fun getTriangleNumber(x: Int): Int {

    if (x == 1)
        return 1


    return foundTriangleNumbers.getOrPut(x) { getTriangleNumber(x - 1) + x }
}

val foundGeneratedBinaryPermute = LinkedHashMap<Int, MutableList<String>>();

fun generateBinaryBalancedPermute(size: Int): MutableList<String> {
    var output: MutableList<String> = mutableListOf()
    if (!foundGeneratedBinaryPermute.containsKey(size)) {
        if (size == 1) {
            output.add("1")
            output.add("0")
            println("Adding ${output}")
            foundGeneratedBinaryPermute[size] = output
            return output
        }

        for (actual in generateBinaryBalancedPermute(size - 1)) {
            output.add("1" + actual)
        }

        for (actual in generateBinaryBalancedPermute(size - 1)) {
            output.add("0" + actual)
        }
        println("Adding ${output}")
        foundGeneratedBinaryPermute[size] = output
        return output
    } else {
        return foundGeneratedBinaryPermute[size]!!
    }

}

inline fun Long.factorial(): BigInteger {
    var factorial: BigInteger = BigInteger.ONE
    for (i in 1..this) {
        factorial *= BigInteger.valueOf(i)
    }
    return factorial
}



