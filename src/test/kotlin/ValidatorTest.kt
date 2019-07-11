import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidatorTest {
    private var numberGenerator = Validator()

    @Test
    fun shouldReturnTrueIfStringIsUnique() {
        val result = numberGenerator.isStringWithUniqueChar("29r4")
        Assertions.assertTrue(result)
    }

    @Test
    fun shouldReturnFalseIfStringIsNotUnique() {
        val result = numberGenerator.isStringWithUniqueChar("w2i3w")
        Assertions.assertFalse(result)
    }

    @Test
    fun shouldGenerateUniqueFourDigitString() {
        val result = numberGenerator.generateUniqueFourDigitString()
        Assertions.assertEquals(4, result.length)
        Assertions.assertTrue(result
            .map{ char -> result.count { char == it } == 1 }
            .all { it }
        )
    }
}
