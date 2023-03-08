package lab.binz.mobilesatu.ti2c

fun isGanjil(x:Int):Boolean = x%2==1

fun Int.isOdd(): Boolean = this%2==1

fun String.tambahChar(): String = "$this ini tambahann char"

fun main(){
    println(isGanjil(5))
    val bilangan = 7
    println(bilangan.isOdd())
    println(8.isOdd())

    println("Angger".tambahChar())
}