import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberTest {
    @Test
    fun shouldGetUniqueFourDigitsIfNoStringIsGiven() {
        val number = Number()
        Assertions.assertTrue(number.getNumber().length == 4)
    }

    @Test
    fun shouldGetStringGiven() {
        val expected = "1234"
        val number = Number(expected)
        Assertions.assertEquals(expected, number.getNumber())
    }
}
