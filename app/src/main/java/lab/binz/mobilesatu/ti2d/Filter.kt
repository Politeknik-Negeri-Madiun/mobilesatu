package lab.binz.mobilesatu.ti2d

fun main(){
    val inst1 = listOf("piano", "cello", "violin")
    val inst2 = listOf("viola", "guitar", "bass")

    val fil1 = inst1.filter { it[0] == 'v' }
    val fil2 = inst2.filter { it[0] == 'v' }
    val final = listOf(fil1, fil2).flatten()
    println(final)

    val flat = listOf(inst1, inst2).flatten().filter { it[0] == 'v' }.map { "main $it" }
    println(flat)

}