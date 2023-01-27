import java.util.TreeMap

//imprimir representacao binaria dos caratares de A a F

fun main() {
    val representacaoBinaria = TreeMap<Char, String>()

    for(char in 'A'..'F'){
        val binario = Integer.toBinaryString(char.code)
        representacaoBinaria[char] = binario
    }

    for ((letra, binario) in representacaoBinaria){
        println("binario: $letra = $binario")
    }
}

