const val ZERO = 0.0
fun convertStringToDouble(input: String): Double {

    try {
        input.toDouble()
    }
    catch (e: NumberFormatException) {
            return ZERO
        }

    return input.toDouble()
}