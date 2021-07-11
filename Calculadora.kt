fun main(args: Array<String>){

    print("Digite o valor de X: ")
    val x = readLine()?.toInt()!!

    print("Digite o valor de Y: ")
    val y = readLine()?.toInt()!!
    val z = (x+y)

    println("Resultado = $z")
}