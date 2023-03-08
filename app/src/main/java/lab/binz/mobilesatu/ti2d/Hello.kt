package lab.binz.mobilesatu.ti2d

fun main(args: Array<String>) {
    //hitung luas bangun datar
    val persegi:(Int, Int) -> Int = { var1, var2 -> var1 * var2 }
    val segitiga:(Int, Int) -> Int = { var1, var2 -> (var1 * var2)/2 }
    val ketupat:(Int, Int) -> Int = { var1, var2 -> (var1 * var2)/2 }
    // panggil
    println(hitungLuasBangunDatar(4,5, persegi))
    println(hitungLuasBangunDatar(4,5, segitiga))
    println(hitungLuasBangunDatar(4,5, ketupat))
    println("=================")
    val persegi1:(Int, Int?) -> Double = { var1, var2 -> (var1 * var1).toDouble() }
    val segitiga1:(Int, Int?) -> Double = { var1, var2 -> ((var1 * var2!!)/2).toDouble() }
    val ketupat1:(Int, Int?) -> Double = { var1, var2 -> ((var1 * var2!!)/2).toDouble() }
    val lingkaran:(Int, Int?) -> Double = { var1, var2 -> 3.14 * (var1*var1) }
    // panggil
    println(hitungLuasBangunDatar2(4,null, persegi1))
    println(hitungLuasBangunDatar2(4,5, segitiga1))
    println(hitungLuasBangunDatar2(4,5, ketupat1))
    println(hitungLuasBangunDatar2(4,null, lingkaran))
}

fun hitungLuasBangunDatar(var1:Int, var2:Int, opt: (Int,Int) -> Int): Int {
    return opt(var1,var2)
}

fun hitungLuasBangunDatar2(var1:Int, var2:Int?, opt: (Int,Int?) -> Double): Double {
    return opt(var1,var2)
}