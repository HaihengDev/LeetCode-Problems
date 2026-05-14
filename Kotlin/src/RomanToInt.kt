fun main() {
  val result: Int = romanToInt("XIV")
  println(result)
}

fun romanToInt(s: String): Int {
  var result: Int = 0
  var i: Int = 0

  while (i < s.length) {
    if (i < s.length - 1) {
      when ("${s[i]}${s[i+1]}") {
        "IV" -> {
          result += 4
          i += 2
          continue
        }
        "IX" -> {
          result += 9
          i += 2
          continue
        }
        "XL" -> {
          result += 40
          i += 2
          continue
        }
        "XC" -> {
          result += 90
          i += 2
          continue
        }
        "CD" -> {
          result += 400
          i += 2
          continue
        }
        "CM" -> {
          result += 900
          i += 2
          continue
        }
      }
    }

    when(s[i]) {
      'I' -> result += 1
      'V' -> result += 5
      'X' -> result += 10
      'L' -> result += 50
      'C' -> result += 100
      'D' -> result += 500
      'M' -> result += 1000
    }
    i++;
  }

  return result;
}