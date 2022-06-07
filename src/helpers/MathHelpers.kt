package helpers

val foundFibNumbers = LinkedHashMap<Int, Int>();


inline fun Int.isMultipleOf(x: Int): Boolean {
    if (x == 0) return true
    return x % this == 0
}

inline fun Long.isMultipleOf(x: Long): Boolean {
    if (x == 0L) return true
    return x % this == 0L
}

inline fun Long.isPrime(): Boolean {
    return getFactors(this).size == 2
}

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

