enum class Cor(val vermelho: Int, val verde: Int, val azul: Int) {
    VERMELHO(255, 0, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255);

    //converter para valores decimal

    fun rgb() = ((vermelho * 256 + verde) * 256 + azul)
}

fun main(){
    val rgb = Cor.VERMELHO.rgb()
    println(rgb)
}