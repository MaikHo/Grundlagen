package oop

interface Namend{
    val name:String  // Eigenschaften sind abstrakt (keine Wertzuweisung möglich)
    open abstract var city:String
}

interface FullNamend : Namend{
    val firstName:String
    val lastName:String

    override val name: String
        get() = "$firstName $lastName"
}

class Mitarbeiter():Namend{
    override val name: String
        get() = "Maik"

    //override var city: String = "Berlin"  // Das kann man machen
    // besser:
    override var city: String = ""
        get() = field
        set(value) {field = value}


}

class Mitarbeiter2(override val firstName: String, override val lastName: String):FullNamend{
    // ist im Interface implementiert
    //override val name: String
    //    get() = "Maik"

    //override var city: String = "Berlin"  // Das kann man machen
    // besser
    override var city: String = ""
        get() = field
        set(value) {field = value}

}

// SAM - Singel abstract methode
// funktional ineterface
fun interface IntPredicate{
    fun accept(i:Int):Boolean
}



fun main(){
    val mitarbeiter = Mitarbeiter()
    mitarbeiter.city

    // erste Version
    val isEven = object : IntPredicate{
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }
    // zweite Version
    val isEven2 = IntPredicate{it % 2 == 0 }

    println("Is 7 even - ${isEven.accept(7)}")
    println("Is 7 even - ${isEven2.accept(7)}")
}








