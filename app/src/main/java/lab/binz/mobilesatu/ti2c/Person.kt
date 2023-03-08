package lab.binz.mobilesatu.ti2c

class Person(var firstName: String, var lastName: String){
    var fullName: String = ""
        get() = "$firstName $lastName"
        set(value) {
            val component = value.split(" ")
            firstName = component[0]
            lastName = component[1]
            field = value
        }

    fun getFullname(): String{
//        println("$firstName $lastName")
        return "$firstName $lastName"
    }
}

fun Person.checkName(): Int = this.fullName.length

fun main() {
    val person = Person("Alex", "Martin")
    println("fullname = ${person.fullName}")
//    person.getFullname()
    println(person.getFullname())
    println(person.checkName())
}
