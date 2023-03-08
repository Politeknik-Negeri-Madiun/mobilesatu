package com.theinternational.appsatu.model

//class Person (var name: String)
class Person(var firstName: String, var lastName:String) {
    var fullName:String = ""
        get() {
            return "$firstName ### $lastName"
        }

        set(value) {
            val components = value.split("|")
            firstName = components[0]
            lastName = components[1]
            field = value
        }

    fun getFullName() {
        println(fullName)
    }
}
