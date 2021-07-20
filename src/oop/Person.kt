package oop
// Kotlin stellt von selbst Setter und Getter
class Person {
    var lastname:String

    //lateinit var firstname:String // nur wenn ganz sicher ist das speter ein Wert gesetzt wird

    var firstname:String = " "
        // falls Getter und Setter verändert werden soll
        set(value){     // hier kann man den Setter ändern
            field = value
            println("setter von firstname")
        }
        get(){     // hier kann man den Getter ändern
            println("getter von firstname")
            return field
        }


    constructor(lastname:String){
        this.lastname = lastname
    }

    constructor(lastname:String, firstname:String):this(lastname){
        this.firstname = firstname
    }


    // selbstgeschriebener Getter wenn oben privat ist
    fun retFirstname():String{
        return firstname
    }


}


fun main(){
    val person = Person("Hoffmann")
    person.firstname = "Maik" // dies ist der Settter (nicht wie in Java)

    val person2 = Person("Hoffmann", "Maik")


}