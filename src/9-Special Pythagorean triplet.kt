import kotlin.math.pow

fun main() {

    var answer: Int = 0
    for (a in 1..1000) {
        for (b in 1..1000) {
            for (c in 1..1000) {
                if (a + b + c == 1000) {
                    print("${a}+${b}+${c} == 1000 ")
                    println("${a.toDouble().pow(2)}+${b.toDouble().pow(2)}==${c.toDouble().pow(2)}")

                    if (a.toDouble().pow(2) + b.toDouble().pow(2) == c.toDouble().pow(2)) {

                        println("Answer = ${a * b * c}")
                        answer = a * b * c
                    }

                }
            }
        }

    }

    println("Answer = ${answer}")
}