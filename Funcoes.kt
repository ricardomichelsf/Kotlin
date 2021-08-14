fun main(args: Array<String>){

    print("Digite um número: ")
    var numero1 = readLine()?.toInt()!!

    print("Digite outro numero: ")
    var numero2 = readLine()?.toInt()!!

    val adicacao = somar(numero1, numero2)
    val multipli = multiplicar(numero1, numero2)

    println("A soma de $numero1 e $numero2 é: $adicacao")
    println("A Multiplicação de $numero1 e $numero2 é: $multipli")
}
// criando funções
fun somar(x: Int, y: Int) : Int = x + y

fun multiplicar(x: Int, y: Int) :Int{
    return x * y
}