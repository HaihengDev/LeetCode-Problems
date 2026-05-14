fun main() {
  val numbers: IntArray = intArrayOf(2, 3, 3, 2)
  val value = 2
  println(removeElement(numbers, value))
}

fun removeElement(nums: IntArray, value: Int): Int {
  var result: Int = 0

  for (i in 0 until nums.size) {
    if(nums[i] != value) {
      nums[result] = nums[i]
      result++
    }
  }

  return result
}