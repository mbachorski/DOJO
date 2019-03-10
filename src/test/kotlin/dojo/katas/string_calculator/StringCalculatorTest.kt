package dojo.katas.string_calculator

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class StringCalculatorTest {

    @Test
    fun add() {
        val x = 1
        val y = 2
        val z = 3
        Assertions.assertThat(z).isEqualTo(x + y)
    }
}