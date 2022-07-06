fun main() {


    var longestChain: Long = 0
    var longestChainIndex: Long = 0
    val chains: MutableList<MutableList<Long>> = mutableListOf()

    for (i in 0 until 1000000) {
        print("Analyzing chain for ${i + 1L}")
        chains.add(mutableListOf())
        var actualNumber: Long = i + 1L
        chains[i].add(actualNumber)
        print(" [${actualNumber}")
        while (actualNumber != 1L) {
            if (actualNumber % 2L == 0L) {//even
                actualNumber /= 2L
            } else {//odd
                actualNumber = (actualNumber * 3L) + 1L
            }
            chains[i].add(actualNumber)
            print("->${actualNumber}")
        }
        println("]")
        if (chains[i].size > longestChain) {
            longestChain = chains[i].size.toLong()
            longestChainIndex = i.toLong()
        }
    }

    println("Longest chain number is ${longestChainIndex + 1} with size ${longestChain} and the chain elements are ${chains[longestChainIndex.toInt()]}")

}