package lab.binz.mobilesatu.ti2c

fun main(){
//    val tambah = {a:Int, b:Int -> a + b}
    val kurang = {a:Int, b:Int -> a - b}
    val kali = {a:Int, b:Int -> a * b}
    val bagi = {a:Double, b:Double -> a / b}

    println(tambah(50,20))
    println(kurang(50,20))
    println(kali(50,20))
    println(bagi(50.0,20.0))
}

fun tambah(a: Int, b:Int): Int{
    return a + b
}