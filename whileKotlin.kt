fun main(args: Array<String>){

    val numeros = arrayListOf<Int>()  // lista vazia

    var tamanho = 0 // tamanho da lista
    while(numeros.size != 10){
        numeros.add(tamanho++) // adicionar itens na lista

        println("Tamanha da lista: ${numeros.size}")
    }
}