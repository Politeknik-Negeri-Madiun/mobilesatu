package lab.binz.mobilesatu.ti2d

fun main(){
    val bilangan = 2
    val bilangan2 = 2.0
    println(isGanjil(bilangan))
    print(bilangan.isOdd())
    print(bilangan2.isOdd())
    print(5.isOdd())
}

fun isGanjil(bil: Int): Boolean{
    return bil %2==1
}

fun Int.isOdd(): Boolean { return this % 2 == 1 }
fun Double.isOdd(): Boolean { return this % 2.0 == 1.0 }
