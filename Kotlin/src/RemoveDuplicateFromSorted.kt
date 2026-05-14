fun main() {
  val numbers: IntArray = intArrayOf(1, 1, 2, 3, 3, 4)

  println(removeDuplicateFromSorted(numbers))
}

fun removeDuplicateFromSorted(nums: IntArray): Int {
  if (nums.isEmpty()) return 0;

  var result: Int = 1

  for (i in 1 until nums.size) {
    if (nums[i - 1] != nums[i]) {
      nums[result] = nums[i]
      result ++
    }
  }

  return result
}