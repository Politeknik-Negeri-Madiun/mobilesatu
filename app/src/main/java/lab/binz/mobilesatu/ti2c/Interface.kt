package lab.binz.mobilesatu.ti2c

interface Shape {
//    val a: Int
    fun computeArea() : Double
    fun computeAround() : Double
}

class Circle1(val radius:Double) : Shape {
    override fun computeArea(): Double {
        return Math.PI * radius * radius
    }

    override fun computeAround(): Double = 2 * Math.PI * radius

}

class Triagle(val a:Double, val b:Double): Shape{
    override fun computeArea(): Double {
        TODO("Not yet implemented")
    }

    override fun computeAround(): Double {
        TODO("Not yet implemented")
    }

}

class Square1(val side: Double):Shape{
    override fun computeArea(): Double {
        TODO("Not yet implemented")
    }

    override fun computeAround(): Double {
        TODO("Not yet implemented")
    }

}

fun main(){
    val c = Circle1(3.0)
    println(c.computeArea())
}


