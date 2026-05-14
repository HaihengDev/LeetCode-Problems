class ListNode(var `val`: Int) {
  var next: ListNode? = null
}

fun buildList(numbers: List<Int>): ListNode? {

  if (numbers.isEmpty()) return null

  val head = ListNode(numbers[0])
  var current = head

  for (i in 1 until numbers.size) {
    current.next = ListNode(numbers[i])
    current = current.next!!
  }

  return head
}



fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

  val dummy = ListNode(-1)
  var current: ListNode? = dummy

  var l1 = list1
  var l2 = list2

  while (l1 != null && l2 != null) {
    if (l1.`val` <= l2.`val`) {
      current?.next = l1
      l1 = l1.next
    } else {
      current?.next = l2
      l2 = l2.next
    }

    current = current?.next
  }

  current?.next = l1 ?: l2

  return dummy.next
}

fun printList(head: ListNode?) {
  var current = head

  while (current != null) {
    print("${current.`val`} -> ")
    current = current.next
  }

  println("null")
}


fun main() {
  val list1 = buildList(listOf(1, 2, 4))
  val list2 = buildList(listOf(1, 3, 4))
  val merged = mergeTwoLists(list1, list2)
  printList(merged)
}
