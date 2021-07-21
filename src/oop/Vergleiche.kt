package oop

fun main(){
    val sb1 = StringBuffer("Hallo")
    val a = "Hallo"
    val b = "Hallo"
    val c = String(sb1)

    println(a==b) // entspricht equals
    println(a.equals(b))
    println(a===b) // referenzielle Vergleich

    println(a==c) // entspricht equals
    println(a.equals(c))
    println(a===c) // referenzielle Vergleich
}