import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberUtilsTest {
    private var numberUtils = NumberUtils()

    @Test
    fun shouldGenerateUniqueFourDigitString() {
        val result = numberUtils.generateUniqueFourDigits()
        Assertions.assertEquals(4, result.length)
        Assertions.assertTrue(result
            .map{ char -> result.count { char == it } == 1 }
            .all { it }
        )
    }
}
