import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidatorTest {
    private var validator = Validator()

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
