fun main(args: Array<String>){

    val cores = arrayListOf<String>()

    cores.add("Vermelho")
    cores.add("Branca")// adiciona umm item ne lista
    cores.add("Azul")
    cores.add("Verde")
    cores.add("Preto")

    cores.remove("Branca") // elimina item na lista

    val tamanho = cores.size
    println(tamanho)

    cores.addAll( arrayOf("Cinza", "Magenta")) // adicionar um conjunto de dados na lista

    val tamanho1 = cores.size
    println(tamanho1)

    val ultimoItem = cores.last()   //cores[ cores.size-1]
    println(ultimoItem)

    cores.forEach{
       //println(it)
    }

}