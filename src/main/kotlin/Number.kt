class Number(numberString: String = "") {
    private val numberUtils = NumberUtils()

    private var numberString: String = ""

    init {
        if (numberString.isEmpty()) {
            this.numberString = numberUtils.generateUniqueFourDigits()
        } else {
            this.numberString = numberString
        }
    }

    fun getNumber(): String {
        return this.numberString
    }
}