package lab.binz.mobilesatu.ti2c

import kotlin.math.sqrt

fun main(){
    val persegi = {a: Double,b:Double? -> a*a}
    val persegipanjang = {a: Double,b:Double? -> a*b!!}
    val segitiga = {a: Double,b:Double? -> 0.5*a*b!!}
    val lingkaran = {a: Double,b:Double? -> 3.14*(a*a)}

    println(hitungLuas(4.0,null,persegi))
    println(hitungLuas(4.0,5.0,persegipanjang))
    println(hitungLuas(4.0,5.0,segitiga))
    println(hitungLuas(4.0,null,lingkaran))
}

fun hitungLuas(a: Double, b:Double?, bangun: (Double, Double?) -> Double): Double {
    return bangun(a,b)
}
