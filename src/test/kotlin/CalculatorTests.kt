import org.junit.jupiter.api.Test

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`

class CalculatorTests {
    @Test
    fun `1 + 1 = 2`() {
        val calculator = Calculator()
        assertThat(calculator.add(1,1), `is`(2))
    }
    @Test
    fun `10 + 10 = 20`() {
        val calculator = Calculator()
        assertThat(calculator.add(10,10), `is`(20))
    }
}