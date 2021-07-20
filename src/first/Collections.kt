package first

import java.util.function.Consumer

fun main(){
    val stringList = listOf("a", "b", "c")
    //stringList.add()  // geht nicht da imutable
    val mutableStringList =  mutableListOf("a", "b", "c")
    mutableStringList.add("d")
    mutableStringList.add(4,"f")

    mutableStringList.addAll(stringList)

    val newList : List<String> = listOf("a", "b", "c")

    println(newList)
    println(mutableStringList)

    for (str in mutableStringList){
        println(str)
    }

    // Variable muss bekannt gegeben werdn
    mutableStringList.forEach {str: String -> println(str) }
    // mit dem Bezeichner it
    mutableStringList.forEach { println(it) }
    // zweite Variante
    mutableStringList.forEach(Consumer<String> {println(it)})  // import java.util.function.Consumer

    println(mutableStringList.size)
    println("drittes Element ${mutableStringList.get(2)}")
    println("viertes Element ${mutableStringList[3]}")
    println("erster index von c ${mutableStringList.indexOf("c")}")
    println("letzter index von c ${mutableStringList.lastIndexOf("c")}")

}