package oop

fun main(){
    val hello = object {
        val str1 = "Hallo"
        val str2 = "World"

        override fun toString(): String {
            return "$str1 $str2"
        }
    }

    println(hello)  // Standartmäßig wird die toString methode ausgeführt

    MyObj.showName()
}

// Vergleichbar mit einem Singleton
// macht immer nur das gleiche ^^
object MyObj{
    val name = "Maik"
    fun showName(){
        println(name)
    }
}

object MyObj2:Parent("", 0){
    val name2 = "Maik"
    fun showName(){
        println(name)
        println(name2)
        println(age)
    }

    //val mc = MyClass() // nicht möglich da private constructor
    val mc = MyClass.create()
}

class MyClass private constructor(){
    companion object Factory{
        fun create() = MyClass()
    }
}
