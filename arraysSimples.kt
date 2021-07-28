import java.util.*

fun main(args: Array<String>) {

    val paises = arrayOf("Angola", "Braail", "Chile", "EUA") // criar array

    val  item = paises[2]  // acessar elemento

    val tamanho = paises.count()

    //val Paises = Array(12, {3})

    // paises.reverse()

    // paises.sortBy { it.length > 3 }

    //val posicao = Arrays.binarySearch(paises, "Chile")

    //println("Chile esta na posicao: $posicao")

    val posicao = Arrays.binarySearch(paises, "Brasil")

    println(paises[posicao])

    paises[posicao] = "BRAZIL"

    println(paises[posicao])
}