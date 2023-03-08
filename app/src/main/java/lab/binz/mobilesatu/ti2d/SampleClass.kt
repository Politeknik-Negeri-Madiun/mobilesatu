package lab.binz.mobilesatu.ti2d

import com.theinternational.appsatu.model.Person

fun main(){
    val person = Person("John","Doe")
    println(person.fullName)
    person.fullName = "Angger Binuko|Paksi"
    println(person.firstName)
    println(person.lastName)
    person.getFullName()
}