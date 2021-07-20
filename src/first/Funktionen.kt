package first


fun main(){

    // Test der Funktionen
    defaultWerte()
    defaultWerte(1)
    // defaultWerte("test")  //geht nicht
    defaultWerte(1, "test")
    defaultWerte(str = "test")
    defaultWerte(str="hallo", value = 1)

    varargs("string1", "a", "b","c", str2 = "string2")


    println("Die Summe ist ${sum(2,3)}")

    var nettoPreis = 2.99

    println(nettoPreis.mwst())

    println(nettoPreis.flexMwst(1.07))

    println(nettoPreis flexMwstVersion2 1.07)

    output("Hallo")

}

// grundlegene Funktion  , die void methode
// fun ausgabe(): Unit{     // Unit kann weggelassen werden
fun ausgabe(){
    println("value")
}

// void mit Parameter und dazu überladen
fun mitParameter(value : Int){
    println(value)
}
fun mitParameter(value : Int, str : String){
    println("$value und $str")
}

// mit defaultwert, kommt kein value beim Aufruf mit wird der defaultwert genommen
fun defaultWerte(value: Int = 0, str: String = "leer"){

}

// variable argumente übergeben (String2 kann man machen sollte man aber nicht)
fun varargs(str1:String,vararg liste:String, str2:String){

}


// Funktion mit Berechnung und Rückgabe
// Unten steht das gleiche nur kürzer
fun sum(i:Int, j:Int):Int{
    return i+j;
}
// Sigelline Funktion
//fun sum(i:Int, j:Int) = i+j;

// erweiterte Funktion für den Datentyp Double
// Aufruf  ->  1.99.mwst() (Double.mwst)
fun Double.mwst():Double{
    return this*1.19
}

// erweiterte Funktion für den Datentyp Double
// Aufruf  ->  1.99.mwst(0.19) (Double.mwst(0.19))
fun Double.flexMwst(value:Double):Double{
    return this*value
}

// erweiterte Funktion für den Datentyp Double
// Aufruf  ->  1.99 flexMwstVersion2 0.19  (Double flexMwstVersion2 0.19 )
infix fun Double.flexMwstVersion2(value:Double):Double{
    return this*value
}

// durch inline wird zur Kompilerzeit der Inhalt eingefügt, geht nicht über den Stack
inline fun output(str: String){
    println(str)
}

// Globale Variable
val eps = 1E-10 // "good enough", could be 10^-15
// recursiver Aufruf von x=Math.cos(x) bis Abbruchbedingung eintritt. Erzeugt durch while(true)
private fun findFixPoint():Double{
    var x = 1.0
    while (true){
        val y = Math.cos(x)
        if (Math.abs(x-y) < eps) return x
        x = Math.cos(x)
    }
}
// so macht man es in Kotlin
val eps1 = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x:Double):Double = if (Math.abs(x - Math.cos(x)) < eps1) x else findFixPoint(Math.cos(x))


// local functions
fun testLocal(i: Int){
    var j = 2
    fun add():Int{
        return i + j
    }
    println(add())
}




