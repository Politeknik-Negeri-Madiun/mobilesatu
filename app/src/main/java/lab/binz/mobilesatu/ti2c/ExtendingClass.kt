package lab.binz.mobilesatu.ti2c

open class Vehicle{
    open val roda: Int = 2
    val haveMachine: Boolean = false

    open fun printRoda(){
        println("jumlah roda = $roda")
    }
}

open class Motor: Vehicle() {
    override val roda: Int = 4
    open val isElectric:Boolean = false
    private val silinder: Int = 4

    fun showSilinder(): Int {
        return silinder
    }
}

open class Motor2: Vehicle() {

}

class Molis: Motor(){
    override val isElectric: Boolean = true
}

fun main(){
    val v = Vehicle()
    println(v.roda)

    val m = Motor()
    println(m.roda)
    println(m.printRoda())
    println(m.showSilinder())

    val m2 = Molis()
    println(m2.roda)
    println(m2.printRoda())
}
