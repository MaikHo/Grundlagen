package first

fun main(){

    val list = listOf("a", "b", "c")    // imutable
    for(str in list){
        println(str)
    }

    for ((index, elem) in list.withIndex()){
        println("$index -> $elem")
    }

    val map = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")  // die Zahlen sind die Schlüssel, Buchstaben die Werte
    for ((key, value) in map){
        println(" $key hat den Wert $value ")
    }

}

fun pruefungen(){
    var i = 5

    if (i<10){
        println(i)
    }

    // Befindet sich i zwischen 1 und 10 (beide inclusive)
    if (i in 1..10){
        println(i)
    }

    var array = arrayOf(1,2,3)
    if (i in array){
        println(" $i ist im Array")
    }

    // zwitch case
    when(i){
        0 -> println("i ist 0")
        1,2,3,4,5,6, 100 -> println("Der Würfel")
        in 10..20 -> println("zwischen 10 und 20")
        in 21 until 30 -> println("Wert von 21 bis 29")
        else -> println("kann man als default sehen")
    }

    var str = "Hallo"
    when(str){
        "Hallo" -> println("ist Hallo")
    }

    // mal kurz ausprobiert
    // stringmethoden
    str.lowercase()
    str.uppercase()
    str.endsWith("llo")
    str.substring(2)
    str.startsWith("Ha")



    var alter = when(i){
        1 -> "ist 1"
        2,5,8 -> "2,5,8"
        else -> "was anderes"
    }
    println(alter)


    // man kann sogar datentypen(bei kotlin nur als objekte) mischen
    var value = when{
        i == 0 -> 0
        str == "Hallo" -> "Hallo"
        else -> null
    }

    // primitieve Datentypen gibt es nicht bei Kotlin
    when(value){
        is String -> println("ist ein String")
        is Int -> println("ist ein INt")
    }
}


