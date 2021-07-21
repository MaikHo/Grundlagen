package oop

class Outer{
    val name = "Hans"
    val fromNested = Outer.Nested().foo()

    class Nested{

        fun foo() = "Hallo"  // kann nicht auf die Member der Outer class zugreifen
    }

    inner class Inner{
        val outer = "name"
        fun bar() = "Hallo $name"
    }
}

fun main(){
    val demo = Outer.Nested().foo()
    val demo2 = Outer().fromNested

    val bar = Outer().Inner().bar()
}