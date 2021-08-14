fun main(args: Array<String>){

    val numeros = arrayListOf<Int>()

    var tamanho  = 0

    // No doWhile o codigo irá rodar pelo menos 1 vez
    do{
        //numeros.add(tamanho++) // ++ é o mesmo que: tamanho = tamanho + 1
        println("O tamanho da lista é: ${numeros.size}")
    } while (numeros.size != 0)
    println("Os numeros são: $numeros")
}