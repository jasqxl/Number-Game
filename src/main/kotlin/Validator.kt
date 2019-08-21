class Validator {
    fun isFourDigitString(string: String): Boolean {
        val fourDigitRegex = """(^\s*[0-9]\s*[0-9]\s*[0-9]\s*[0-9]\s*$)""".toRegex()
        return fourDigitRegex.matches(string)
    }

    fun isStringWithUniqueChar(string: String): Boolean {
        return string
            .map{ char -> string.count { char == it } == 1 }
            .all { it }
    }

    fun occurrenceCount(input: String, answer: String): Int {
        return input
            .map { char -> answer.find { stringChar -> stringChar == char } != null }
            .filter { bool -> bool == true }
            .size
    }
}