package lab.binz.mobilesatu.ti2d

interface Alphabet {

}

open class A(): Alphabet{
    open val a = "A"
    val c = "C"

    private fun printHello(){
        println("Hello")
    }
}

class B : A () {
    val b = "B"
    val d = c
}

fun main(){
    val a = A()
    println(a.a)

    val b = B()
    println(b.a)
    println(b.b)
    println(b.c)
}
