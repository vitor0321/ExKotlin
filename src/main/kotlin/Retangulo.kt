class Retangulo(val altura: Int, val  largura: Int) {
    val isQuadrado: Boolean
        //Assessor Custumizado
        get() {
            return altura == largura
        }
}

fun main(){
    val quadrado: Retangulo = Retangulo(10,10)
    println(quadrado.isQuadrado)
}
