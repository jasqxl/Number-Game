import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import org.junit.jupiter.api.assertThrows

class NumberUtilsTest {
    private var numberUtils = NumberUtils()

    @Test
    fun shouldNotThrowErrorIfInputIsValid() {
        Assertions.assertDoesNotThrow {
            val number = Number()
            Assertions.assertEquals(4, number.getNumber().length)
            Assertions.assertTrue(number.getNumber()
                .map{ char -> number.getNumber().count { char == it } == 1 }
                .all { it })
            numberUtils.checkInput(number)
        }
    }

    @Nested
    inner class GenerateUniqueFourDigits {
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

    @Nested
    inner class CheckInput {
        @Test
        fun shouldThrowNotFourDigitsException() {
            val exception = assertThrows<IllegalArgumentException>{
                numberUtils.checkInput( Number("12in"))
            }
            Assertions.assertEquals("Input is not a 4 digit string, please try again", exception.message)
        }

        @Test
        fun shouldThrowNotUniqueFourDigitsException() {
            val exception = assertThrows<IllegalArgumentException>{
                numberUtils.checkInput( Number("1222"))
            }

            Assertions.assertEquals("Input is not a unique string, please try again", exception.message)
        }
    }
}
