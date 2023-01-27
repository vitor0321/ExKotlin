package utils.strings

fun Collection<String>.joinString(
    separador: String = "; ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)

    for ((index, elemento) in this.withIndex()) {

        if (index > 0) result.append(separador)

        result.append(elemento)
    }

    result.append(postfix)
    return result.toString()
}