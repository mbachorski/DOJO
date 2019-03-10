package dojo.katas

/**
 * https://osherove.com/tdd-kata-1
 */
class StringCalculator {
  operator fun invoke(input: String): Int {
    if (input == "") return 0
    return input.toInt()
  }
}