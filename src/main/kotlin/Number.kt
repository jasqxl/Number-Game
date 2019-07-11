import kotlin.random.Random

class Number(
    private val validator: Validator
) {
    private var answer: String = ""
    private var guess: String = ""

    fun generateUniqueFourDigits(): String {
        this.answer = Random.nextInt(0, 9999).toString().padStart(4, '0')

        if (validator.isStringWithUniqueChar(this.answer)) {
            println("4 random unique digits successfully generated")
            return this.answer
        }
        return generateUniqueFourDigits()
    }
}