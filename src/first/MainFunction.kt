package first

fun main(){
    println("Hallo")
    // System.out.println("Hallo");  // Java ^^

    // Java Klasse benutzen
    var pj = Person("Hoffmann", "Maik", "Hier","2", "12025","Hüselitz")

    // Kotlin Klassen benutzen
    var pk = Personkotlin1("Hoffmann", "Maik", "Hier","2", "12025","Hüselitz")
    var pk1 = Personkotlin1("Mustermann" , street = "da",)

    println(pk.toString())
    println(pk.hashCode())
    println(pk1.toString())
    println(pk.equals(pj))


}


class Main(){
    companion object{
        @JvmStatic
        fun main(args : Array<String>){ // public static main methode
            println("Hallo Maik")
        }
    }

}