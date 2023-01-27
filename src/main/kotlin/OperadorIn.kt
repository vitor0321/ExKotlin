fun main() {

    println(isLetter('r'))
    println(isNotNumber('4'))
}

fun isLetter(char: Char): Boolean = char in 'a'..'z'  || char in 'A'..'Z'

fun isNotNumber(char: Char):Boolean = char !in '0'..'9'