import kotlin.math.roundToInt

fun main() {
    solution("300.01", arrayOf("300.00", "200.00", "100.00"))
}

fun solution(S: String, B: Array<String>): Array<String> {
    // write your code in Kotlin 1.3.11 (Linux)
    var output: Array<String> = Array<String>(B.size) { "" }
    var remainder: Double = S.toDouble()

    for (i in B.indices) {

        var followingSum: Double = 0.0
        for (j in i until B.size) {
            followingSum += B[j].toDouble()
        }

        output[i] = (((remainder * (B[i].toDouble() / followingSum) * 100)).roundToInt() / 100).toInt().toString()


        remainder -= (output[i]).toDouble()


    }

    return output
}