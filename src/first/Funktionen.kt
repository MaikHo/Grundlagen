package first


fun main(){
    defaultWerte()
    defaultWerte(1)
    // defaultWerte("test")  geht nicht
    defaultWerte(1, "test")
    defaultWerte(str = "test")
    defaultWerte(str="hallo", value = 1)

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