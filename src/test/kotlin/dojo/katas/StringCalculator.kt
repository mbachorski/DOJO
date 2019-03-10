package dojo.katas

/**
 * https://osherove.com/tdd-kata-1
 */
class StringCalculator {
  operator fun invoke(input: String): Int {
    return if (input.contains(",")) {
      sumArray(input)
    } else if (input == "") {
      0
    } else {
      input.toInt()
    }
  }

  private fun sumArray(input: String): Int {
    var sum = 0
    input.split(",").forEach { sum += it.toInt() }
    return sum
  }
}