class Validator {
    fun isStringWithUniqueChar(string: String): Boolean {
        return string
            .map{ char -> string.count { char == it } == 1 }
            .all { it }
    }
}