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

interface Info{
    // Zwang mit dem prinln das die Methode in Subchild implementiert werden mus
    fun info(){
        println("Info aus dem Interface")
    }
    // muss in Subchild auch implementiert werden
    fun demo()

    // damit kann auch die Subchild gezwungen werden abstrackt zu werden
    fun demo1()
}

// Interface benutzen -> ,Info  (Komma Info :-))
abstract class SubChild(name:String, age:Int):Child(name,age),Info{

    // override fun andereFunktion(){}  // kann an dieser Stelle nicht überschrieben werden
    override fun info() {
        println("Info aus SubChild")
        super<Info>.info() // Holen der Methode aus dem Interface
        super<Child>.info() // Holen der Methode aus Child
    }
    /* für abstract ausgeblendet
    override fun demo() {
        TODO("Not yet implemented")
    }
    */

}

fun main(){
    val p = Parent("Maik", 40)
    p.toString()

    val c = Child("Hans", 33)
    println(c.name)

    c.notOverreit()

    val sc = object: SubChild("Test", 7){
        override fun demo() {
            println("aus einer anonyme Klasse")
        }

        override fun demo1() {
            println("aus einer anonyme Klasse")
        }

    }
    sc.info()

}