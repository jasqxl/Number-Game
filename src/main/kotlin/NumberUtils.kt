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
}