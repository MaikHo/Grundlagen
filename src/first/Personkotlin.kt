package first

import java.util.*

/**
 * Hier ist die Version der Java Klasse  Person in Java
 *
 * Diese Klasse kann man auch als data class benutzen
 * siehe Personkotlin1.kt
 */
class Personkotlin {
    var lastname: String? = null    // Nullsicher machen???
    var firstname: String
    var street: String
    var number: String
    var zip: String
    var city: String

    constructor(lastname: String, firstname: String, street: String, number: String, zip: String, city: String) {
        this.lastname = lastname
        this.firstname = firstname
        this.street = street
        this.number = number
        this.zip = zip
        this.city = city
    }

    constructor(other: Person) {
        lastname = other.lastname
        firstname = other.firstname
        street = other.street
        number = other.number
        zip = other.zip
        city = other.city
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val person = o as Person
        return lastname == person.lastname && firstname == person.firstname && street == person.street && number == person.number && zip == person.zip && city == person.city
    }

    override fun hashCode(): Int {
        return Objects.hash(lastname, firstname, street, number, zip, city)
    }

    override fun toString(): String {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}'
    }
}
