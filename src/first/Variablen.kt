package first

fun main(){
    var name : String = "Hoffmann"
    var fistname = "Maik"

    var street : String?

    var age : Int = 0
    var age1 = 0

    var preis : Double = 0.0

    preis = 17.toDouble()  // Cast zwingend notwendig


    // Konstante , nicht veränderbar
    val city = "Hüselitz"

    street = value()
    if (street != null) {
        println(street.length)
    }

    //println(street.length) // Wird gemechkert wegen der Nullsicherheit
    //println(street!!.length)// Behauptung : street ist niemals null, nur wenn ich mir sicher bin

    println(street?.length)  // damit printet null aus (als String)
    //println(street?.length + 1)  // da null möglich keine ausführbare Berechnung

    // Elvis Operator
    println(street?.length ?: - 1 + 2) // wenn street null ist dann ersetze es mit -1 und dann rechne mit 2

    var length = if(street != null) street.length else -1
    println(length)


    street?.length?.let { println(street.length) }  // Lambda
    street?.length?.let { println(street.length) }?: println(-1)  // ?: ....  wenn kein Objekt street vorhanden ist, tue was anderes

    output("Hoffmann", "Maik")

}

// Rückgabe Typ steht hinter ()
// ? steht dafür das auch ne null kommen kann
fun value():String?{
    return null
}


fun output(name:String, firstname:String){
    println("Hallo "+firstname+" "+name+" wie gehts?")
    println("Hallo $firstname $name wie gehts?")
    println("Der Name hat ${name.length} Zeichen und in der Summe  ${name.length + firstname.length} ")
}