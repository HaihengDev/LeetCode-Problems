fun main() {
  println(isPalindrome(-121))
}

fun isPalindrome(num: Int): Boolean {
  return try {
    val reversedNum: Int = num.toString().reversed().toInt()
    num == reversedNum
  } catch (e: NumberFormatException) {
    false
  }
}