import kotlin.random.Random

class Validator {
    private var randomFourDigit: String = ""

    fun generateUniqueFourDigitString(): String {
        this.randomFourDigit = Random.nextInt(0, 9999).toString().padStart(4, '0')
        if (isStringWithUniqueChar(this.randomFourDigit)) {
            return this.randomFourDigit
        }
        return generateUniqueFourDigitString()
    }

    fun isStringWithUniqueChar(string: String): Boolean {
        return string
            .map{ char -> string.count { char == it } == 1 }
            .all { it }
    }
}