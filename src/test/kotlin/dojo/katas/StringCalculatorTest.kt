package dojo.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class StringCalculatorTest {

  @Test
  fun `Empty string should return 0`() {
    assertThat(StringCalculator()(""))
      .isEqualTo(0)
  }

  @ParameterizedTest
  @MethodSource("singleInput")
  fun `Single char should return sum as itself as Int`(input: String, expected: Int) {
    assertThat(StringCalculator()(input))
      .isEqualTo(expected)
  }

  companion object {
    @JvmStatic
    fun singleInput() = listOf(
      Arguments.of("0", 0),
      Arguments.of("1", 1)
    )

    @JvmStatic
    fun input() = listOf(
      Arguments.of("0,0", 0),
      Arguments.of("0,1", 1),
      Arguments.of("1,0", 1),
      Arguments.of("1,1", 2),
      Arguments.of("1,2", 3),
      Arguments.of("100,200", 300)
    )
  }

  @ParameterizedTest
  @MethodSource("input")
  fun `Sum 2 numbers separated by ','`() {
    assertThat(StringCalculator()("1,2"))
      .isEqualTo(3)
  }
}