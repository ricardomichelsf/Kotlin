fun main(args: Array<String>){

    val x = 10
    val y = 15

    print("Digite alguma coisa: ")
    val n1 = readLine()
    print("Digite alguma coisa:")
    val n2 = readLine()

    println(x == y)
    println(x != y)
    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)
    println(n1 is String)
    println(n2 is String)
}