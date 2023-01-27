import utils.strings.joinString
import utils.strings.lastChar

// ( 1; 2; 3)

fun main() {

    val frutas = listOf("Banana", "maca", "manga")
    println(frutas.joinString())

    val lastChar = "Kotlin".lastChar()
    println(lastChar)
}