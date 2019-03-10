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
    return input.split(",").fold(0){
      acc: Int, s: String -> acc + s.toInt()
    }
  }
}