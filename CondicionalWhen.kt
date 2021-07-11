fun main(args: Array<String>){

    val idade = 100

    when(idade){
        in 1..17 -> print("Criança")
        in 18..29 -> println("Jovem")
        in 30..60 -> println("Senhor")
        else -> print("Idoso")
    }
}