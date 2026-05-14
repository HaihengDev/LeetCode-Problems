fun solution(numbers: IntArray, target: Int): IntArray {
  for (i in 0 until numbers.size)
    for (j in (i+1) until numbers.size)
      if (numbers[i] + numbers[j] == target) {
        return intArrayOf(i, j);
      }
  return intArrayOf()
}

fun main() {
  val numbers = intArrayOf(3, 6, 2, 5, 12)
  val target: Int = 9
  val result: IntArray = solution(numbers, target)
  println(result.contentToString())
}