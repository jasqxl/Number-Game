import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ValidatorTest {
    private var validator = Validator()

    @Nested
    inner class IsFourDigitString {
        @Test
        fun shouldReturnFalseIfStringIsEmpty() {
            val result = validator.isFourDigitString("")
            Assertions.assertFalse(result)
        }

        @Test
        fun shouldReturnTrueIfStringIsHasFourDigits() {
            val result = validator.isFourDigitString("1111")
            Assertions.assertTrue(result)
        }

        @Test
        fun shouldReturnTrueIfStringIsHasFourDigitsWithSpaces() {
            val result = validator.isFourDigitString(" 1 1 1 1 ")
            Assertions.assertTrue(result)
        }

        @Test
        fun shouldReturnFalseIfStringHasMoreThanFourDigits() {
            val result = validator.isFourDigitString("11111")
            Assertions.assertFalse(result)
        }

        @Test
        fun shouldReturnFalseIfStringHasANonDigitChar() {
            val result = validator.isFourDigitString("d111")
            Assertions.assertFalse(result)
        }
    }

    @Nested
    inner class IsStringWithUniqueChar {
        @Test
        fun shouldReturnTrueIfStringIsEmpty() {
            val result = validator.isStringWithUniqueChar("")
            Assertions.assertTrue(result)
        }

        @Test
        fun shouldReturnTrueIfStringIsUnique() {
            val result = validator.isStringWithUniqueChar("29r4")
            Assertions.assertTrue(result)
        }

        @Test
        fun shouldReturnFalseIfStringIsNotUnique() {
            val result = validator.isStringWithUniqueChar("w2i3w")
            Assertions.assertFalse(result)
        }
    }

    @Nested
    inner class OccurranceCount {
        @Test
        fun shouldReturnZeroCount() {
            val result = validator.occurrenceCount("8765", "1234")
            Assertions.assertEquals(0, result)
        }

        @Test
        fun shouldReturnCorrectCount() {
            val result = validator.occurrenceCount("5234", "2345")
            Assertions.assertEquals(4, result)
        }
    }
}
