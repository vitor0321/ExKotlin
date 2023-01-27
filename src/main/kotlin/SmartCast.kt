interface Expressao
class Numero(val valor: Int): Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int{
    if (expressao is Numero){
        return expressao.valor
    }

    if (expressao is Soma){
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }

    throw IllegalAccessException("illegal access Exception")
}

fun avaliacaoComRamificacao(expressao: Expressao): Int = when(expressao){
    is Numero -> {
        println("o numero 'e: ")
        expressao.valor
    }
    is Soma -> {
        val esquerdo = avaliacao(expressao.esquerdo)
        val direito = avaliacao(expressao.direito)

        println("soma $esquerdo + $direito")
        esquerdo + direito
    }
    else -> throw IllegalAccessException("illegal access Exception")
}

fun main() {
    //(2 + 3 ) + 4

    val resultado = avaliacao(Soma(Soma(Numero(2), Numero(3)), Numero(4)))
    println(resultado)

    val resultadoComRamificacao = avaliacaoComRamificacao(Soma(Soma(Numero(2), Numero(3)), Numero(4)))
    println(resultadoComRamificacao)
}