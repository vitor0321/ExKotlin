import com.sun.nio.sctp.AbstractNotificationHandler
import kotlin.jvm.internal.SpreadBuilder

// ( 1; 2; 3)

fun main() {

    val frutas = listOf("Banana", "maca", "manga")
    println(joinToString(frutas))
}

fun joinToString(
    collection: Collection<String>,
    separador: String = "; ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)

    for ((index, elemento) in collection.withIndex()) {

        if (index > 0) result.append(separador)

        result.append(elemento)
    }

    result.append(postfix)
    return result.toString()
}