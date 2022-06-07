package helpers

inline fun String.isPalindrome(): Boolean {

    var i: Int = 0
    var j: Int = this.length - 1
    while (j > i) {
        if (this[i] != this[j]) {
            return false
        }
        i++
        j--
    }
    return true
}
