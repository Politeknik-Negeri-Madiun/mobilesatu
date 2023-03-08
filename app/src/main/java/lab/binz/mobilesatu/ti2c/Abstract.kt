package lab.binz.mobilesatu.ti2c

abstract class Food {
    abstract val kcal : Int
    abstract val name : String
    fun consume() = println("I'm eating ${name} with ${kcal} kkal")
}

class Pizza(): Food() {
    override val kcal: Int = 600
    override val name = "Pizza"
}

abstract class Mahasiswa {
    abstract val gender : String
    abstract val name : String
    fun afiliasi() = println("mahasiswa ${name} gender ${gender} kuliah di PNM")
}

class MahasiswaLaki(): Mahasiswa() {
    override val gender: String = "Laki"
    override val name: String = "Angger"

}

fun main() {
    Pizza().consume()    // "I'm eating Pizza"
    MahasiswaLaki().afiliasi()

    val m = MahasiswaLaki()
    m.afiliasi()
}

