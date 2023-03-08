package lab.binz.mobilesatu.ti2c

class Circle(val radius:Double) {
    constructor(diameter: Int): this(diameter/2.0)
    constructor(name: String):this(4)

    init {
        println("Area: ${Math.PI * radius * radius}")
    }


}

class Square(val side: Int) {
    init {
        println("Otomatis = ${side * 4}")
    }

    fun hitungKeliling(){
        println("Manual = ${side * 4}")
    }
}

fun main(){
    val c1 = Circle(2.0)
    val c2 = Circle(4)
    val c3 = Circle("empat")


//    val p = Square(10)
//    p.hitungKeliling()
//    println(c1)
}
