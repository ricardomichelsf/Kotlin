fun main(args: Array<String>){

    print("Digite a sua idade: ")
    val idade = readLine()?.toInt()!!

    when(idade){
        in 1..17 -> print("Criança")
        in 18..29 -> println("Jovem")
        in 30..60 -> println("Senhor")
        else -> print("Idoso")
    }
}