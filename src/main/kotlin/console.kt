class Console(
    private val validator: Validator
) {
    private var answer: String = ""

    fun play() {
        println("Welcome to the Validator Game!")
        this.answer = validator.generateUniqueFourDigitString()
        return
    }
}
