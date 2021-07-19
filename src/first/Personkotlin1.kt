package first

import java.util.*

// genauso die Inhalte und Methoden vorhanden wie in der anderen Personkotlin
// data deklariert die Klasse als reinen Datenhalter
// Konstruktoren und alle sonst überschriebenen Methoden werden automatisch von Kotlin bereitgestellt
data class Personkotlin1(var lastname: String? = null,
                    var firstname: String? = null,
                    var street: String? = null,
                    var number: String? = null,
                    var zip: String? = null,
                    var city: String? = "Berlin",// Defaultwert
                    var age: Int? = 0)