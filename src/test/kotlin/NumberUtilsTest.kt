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

    @Nested
    inner class GetResult {
        @Test
        fun shouldReturn0A0B() {
            val result = numberUtils.getResult(Number("1234"), Number("6795"))
            Assertions.assertEquals("0 A 0 B", result)
        }

        @Test
        fun shouldReturn0A4B() {
            val result = numberUtils.getResult(Number("7421"), Number("1742"))
            Assertions.assertEquals("0 A 4 B", result)
        }

        @Test
        fun shouldReturn1A3B() {
            val result = numberUtils.getResult(Number("1234"), Number("1742"))
            Assertions.assertEquals("1 A 3 B", result)
        }

        @Test
        fun shouldReturn4A4B() {
            val result = numberUtils.getResult(Number("1236"), Number("1236"))
            Assertions.assertEquals("4 A 4 B", result)
        }
    }
}
