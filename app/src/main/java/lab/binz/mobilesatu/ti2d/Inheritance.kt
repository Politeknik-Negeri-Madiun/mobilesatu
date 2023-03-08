package lab.binz.mobilesatu.ti2d

fun main(){
    val c = Circle(4.0)
    println("Luas Lingkaran c = ${c.computeArea()}")
    println("Keliling Lingkaran c = ${c.computeAround()}")

    val s = Square(4.0)
    println("Luas pesegi s = ${s.computeArea()}")
    println("Keliling pesegi s = ${s.computeAround()}")
}

