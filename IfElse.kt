fun main(args: Array<String>){

    print("Digite um número: ")
    val x = readLine()?.toInt()!!

    if((x % 2) == 0){
        println("È par")
    } else {
        println("È impar")
    }
}