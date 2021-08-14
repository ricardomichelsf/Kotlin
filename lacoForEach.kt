

fun main(args: Array<String>){

    val frutas = arrayListOf<String>("Banana", "Manga", "Pera", "Pessego", "Uva")

    val fList = frutas.onEach {
        println(it.toUpperCase())
    }

    /*frutas.forEach {
        println(it)
    }

    frutas.forEach { nomeFruta ->
        println(nomeFruta.toUpperCase())
    }*/
}