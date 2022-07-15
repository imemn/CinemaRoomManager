
fun printFifthCharacter(input: String): String {
    return "The fifth character of the entered word is ${input[4]}"
    try {
        if (input.length < 5) {
            throw StringIndexOutOfBoundsException()
        }
        return input
    }
    catch (e.StringIndexOutOfBoundsException;){
        println("The input word is too short!")
    }
}