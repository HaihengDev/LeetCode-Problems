fun main() {
  println(strStr("sadbutsad", "sadbutsad"))
}

fun strStr(haystack: String, needle: String): Int {
  if (needle.isEmpty()) return 0

  for (i in 0..(haystack.length - needle.length)) {
    var j = 0
    while (j < needle.length && haystack[i + j] == needle[j]) {
      j++
    }

    if(j == needle.length) {
      return i
    }
  }

  return -1
}