import java.util.*

fun main(args: Array<String>) {

    print("Digite um palpite: ")
    val palpite = readLine()?.toInt()!! // recebe o valor digitado

    // elcolhe um numero aleatorio
    val random = Random()
    // o numero 6 é o limite que ele possa gerar, o +1 serve para começar apartir do numero 1
    val dado = random.nextInt(6)+1

    println("Palpite: $palpite")
    println("Dado: $dado ")

    // verifica se o palpite é igual ao numero sorteado
    when(palpite == dado){
        true -> println("Você acertou")
        false -> println("Você errou")
    }

}