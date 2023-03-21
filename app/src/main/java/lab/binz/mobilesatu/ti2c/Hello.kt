package lab.binz.mobilesatu.ti2c

fun main(){
    hello("Angger")
    val bookAuthor = bookAuthor("Harry Potter", "J.K. Rowling")
    val bookAuthorPair = Pair("Harry Potter", "J.K. Rowling")

    println(bookAuthor.title)
    println(bookAuthor.name)


    println(bookAuthorPair.first)
    println(bookAuthorPair.second)

//    val c = Calculator()
    val c = CommonCalculator(1,2)
    println(c.add())

    val d = CommonCalculator(3,4)
    println(d.add())

    println(Calculator.add(2,2))
    println(Calculator.add(3,4))
}


fun hello(name: String){
    println("hello $name")
}

class CommonCalculator(val a:Int, val b:Int){
    fun add(): Int {
        return a+b
    }
}

object Calculator {
    fun add(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}

data class bookAuthor(val title: String, val name: String)


class PhysicsSystem {
    companion object WorldConstants {
        val gravity = 10
        val unit = "metric"
        fun computeForce(mass: Double, accel: Double): Double {
            return mass * accel
        }
    }
}
