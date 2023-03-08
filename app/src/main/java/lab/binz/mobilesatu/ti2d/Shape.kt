package lab.binz.mobilesatu.ti2d

interface Shape {
    fun computeArea() : Double
    fun computeAround() : Double
}

class Circle(val radius: Double): Shape {
    override fun computeArea(): Double = Math.PI * radius * radius

    override fun computeAround(): Double {
        return 2 * Math.PI * radius
    }
}

class Square(val sisi: Double): Shape{
    override fun computeArea(): Double = sisi * sisi

    override fun computeAround(): Double {
        return sisi * 4
    }

}
