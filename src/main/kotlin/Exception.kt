fun main() {
    try {
        println(getPorcentagem(122))
    } catch (e: IllegalAccessException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun getPorcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else throw IllegalAccessException("O numero deve estar no intervalo de 1 a 100")
}