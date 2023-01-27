fun obterDescricao(cor: Cor) = when(cor){
    Cor.VERMELHO -> "cor vermelha"
    Cor.AZUL -> "cor azul"
    Cor.VERDE -> "cor verde"
}

fun obterPrimeiraLetra(cor: Cor) = when(cor){
    Cor.VERMELHO, Cor.VERDE -> "primeira letra 'e V"
    Cor.AZUL -> "primeira letra 'e A"
}

fun main() {
    val descricao = obterDescricao(Cor.VERDE)
    println(descricao)

    val primeiraLetra = obterPrimeiraLetra(Cor.AZUL)
    println(primeiraLetra)
}