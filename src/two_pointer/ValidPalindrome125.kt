package two_pointer

fun main() {
    val v = ValidPalindrome125()

    println(v.isPalindrome(",."))

    // edge case ",...."
    // edge case " "
    // edge case "ab!====#$%ba"
}

class ValidPalindrome125 {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        if (s.isEmpty()) return true

        while (left < right) {
            // must set (left < right) not (left < s.length - 1) to prevent all symbol edge case
            while (left < right && !s[left].isLetterOrDigit()) {
                left += 1
            }
            while (right > left && !s[right].isLetterOrDigit()) {
                right -= 1
            }
            if (s[left].toLowerCase() != s[right].toLowerCase()) {
                return false
            }
            left += 1
            right -= 1
        }
        return true
    }
}