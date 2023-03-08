package lab.binz.mobilesatu.ti2d

abstract class Food {
    abstract val kcal : Int
    abstract val name : String
    fun consume() = println("I'm eating ${name}")
}

class Pizza() : Food() {
    override val kcal = 600
    override val name = "Pizza"
}

fun main() {
    val p = Pizza()
    p.consume()
//    Pizza().consume()    // "I'm eating Pizza"
}
