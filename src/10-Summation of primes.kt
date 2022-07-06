import helpers.isPrime
import java.math.BigInteger

fun main() {

    var answer: BigInteger = BigInteger.valueOf(0)


    for (a in 1..2000000) {

        if (a.toLong().isPrime()) {
            answer += BigInteger.valueOf(a.toLong())
            println("${a} is prime -> SUM:${answer}")
        }

    }

    println("Answer = ${answer}")
}