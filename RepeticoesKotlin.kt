fun main() {

    var t:Int
    var x:Int? = null
    var w:Int? = 10
    t = x?: w ?: -1

    println(t)
}

fun man() {
    //for(i in 0..20){
    //print("$i ")
    //}
    letters2()
}

fun downTo(){
    for(i in 20 downTo 0) {
        print("$i ")
    }
}

fun until() {
    for(i in 1 until 20) {
        print("$i ")
    }
}

fun step(num:Int){
    for(i in 0..20 step num){
        print("$i ")
    }
}

fun letters(){
    val Array = "Olha essa String!!"
    for(l in Array){
        print(l.toUpperCase()+ " ")
    }
}

fun letters2(){
    val sArray = "Olha essa String!!"
    sArray.forEach{l ->
        print(l + " ")
    }
}