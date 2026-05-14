fun main() {
  println(validateParenthesis(")("))
  println(validateParenthesis("()"))
}

fun validateParenthesis(s: String): Boolean {
  val stack = ArrayDeque<Char>()

  val matchingBracket = mapOf(')' to '(', '}' to '{', ']' to '[')

  for (char in s) {
    if (char in matchingBracket.values) {
      stack.addLast(char)
    } else if (char in matchingBracket.keys) {
      if(stack.isEmpty() || stack.removeLast() != matchingBracket[char]) {
        return false
      }
    }
  }

  return stack.isEmpty()
}