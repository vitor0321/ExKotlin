
fun soma(vararg numero : Int, valor: Int) = numero.sum()

fun main() {
    val list= intArrayOf(10,2,3,90,123)
    val listArray= arrayOf(10,2,3,90,123)
    val somatorioArray = soma(*listArray.toIntArray(), valor = 23)
    val somatorio = soma(*list, valor = 23)
    println(somatorioArray)
    println(somatorio)
}