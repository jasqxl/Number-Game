import java.lang.IllegalArgumentException
import kotlin.random.Random

class NumberUtils {
    private val validator = Validator()

    fun generateUniqueFourDigits(): String {
        val randomNumber = Random.nextInt(0, 9999).toString().padStart(4, '0')

        if (validator.isStringWithUniqueChar(randomNumber)) {
            println("4 random unique digits successfully generated")
            return randomNumber
        }
        return generateUniqueFourDigits()
    }

    fun checkInput(number: Number) {
        val numberString = number.getNumber()
        if (!validator.isFourDigitString(numberString)) {
            throw IllegalArgumentException("Input is not a 4 digit string, please try again")
        }
        if (!validator.isStringWithUniqueChar(numberString)) {
            throw IllegalArgumentException("Input is not a unique string, please try again")
        }
    }
}