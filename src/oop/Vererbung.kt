package oop

// Any ist gleichzusetzen mit der Objektklasse von Java (Any muss nicht angegeben werden und ist immer da)
// :Any() -> so wird geerbt
// zum Vererben muss ich die Klasse öffnen (open)
open class Parent(val name:String, val age:Int):Any(){
    // wenn das Argument von Child verändert werden soll dann muss open stehen (öffnen)
    open val city:String = "Berlin"

    // wenn die Methode von Child verändert werden soll dann muss open stehen (öffnen)
    open fun info(){
        println("$name kommt aus $city und ist $age Jahre alt.")
    }

    fun notOverreit(){
        println("kann nicht überschrieben werden von Child")
    }

    open fun andereFunktion(){

    }

}

open class Child(name:String, age:Int):Parent(name, age){
    override val city:String = "Hamburg"

    override fun info(){
        println("$name kommt aus $city und ist $age Jahre alt.")
    }

    fun superinfo(){
        super.info()
    }

    final override fun andereFunktion(){
        println("Hier ist die Funktion perfekt")
    }
}

class SubChild(name:String, age:Int):Child(name,age){
    // override fun andereFunktion(){}  // kann an dieser Stelle nicht überschrieben werden
}

fun main(){
    val p = Parent("Maik", 40)
    p.toString()

    val c = Child("Hans", 33)
    println(c.name)

    c.notOverreit()

}