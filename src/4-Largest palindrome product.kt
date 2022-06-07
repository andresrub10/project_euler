import helpers.isPalindrome

fun main() {

    val palindromeMult: MutableList<Int> = mutableListOf()

    for (i in 100..999) {
        for (j in 100..999) {
            if ((i * j).toString().isPalindrome()) {
                palindromeMult.add(i * j)
            }
        }
    }
    palindromeMult.sort()
    println(palindromeMult)
    println("Respuesta =  ${palindromeMult.last()}")


}