fun main() {
    var temperatura = 0
    var somatorio = 0
    var quantidade = 0

    while (temperatura != 999){
        println("digite uma temperatura ou 999 para sair")
        temperatura = readln()!!.toInt()

        if (temperatura != 999){
            somatorio += temperatura
            quantidade++
        }
    }

    println("a media da temperatura 'e: ${somatorio/quantidade}" )

    //vai entrar na expressao pelo menos uma vez
    do {
        println("digite uma temperatura ou 999 para sair")
        temperatura = readln()!!.toInt()

        if (temperatura != 999){
            somatorio += temperatura
            quantidade++
        }
    }
    while (temperatura != 999)

    println("a media da temperatura 'e: ${somatorio/quantidade}" )
}