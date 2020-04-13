package subtask2

class TimeConverter {

    // TODO: Complete the following function
    //Input: two parameters - hour: String, minute: String
    //Output: text representation (String) of time

    private fun intToString(digits: Int): String {
        val fArray = arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
        )
        val sArray = arrayOf(
            "",
            "",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
        )
        var numbers = ""
        if (digits < 20) {
            numbers = fArray[digits]
        } else if (digits < 100) {
            val g = digits % 10
            val k = (digits - g) / 10
            numbers = if (g == 0) {
                sArray[k]
            } else {
                sArray[k] + " " + fArray[g]
            }
        }
        return numbers
    }

}
