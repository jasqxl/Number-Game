import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberTest {
    private var number = Number(Validator())

    @Test
    fun shouldGenerateUniqueFourDigitString() {
        val result = number.generateUniqueFourDigits()
        Assertions.assertEquals(4, result.length)
        Assertions.assertTrue(result
            .map{ char -> result.count { char == it } == 1 }
            .all { it }
        )
    }
}
