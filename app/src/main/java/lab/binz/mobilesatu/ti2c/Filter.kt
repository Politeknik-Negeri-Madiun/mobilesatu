package lab.binz.mobilesatu.ti2c

//fun main(){
//    val instruments = listOf("viola", "cello", "violin")
//    val eager = instruments.filter { it [0] == 'v' }
//    println("eager: " + eager)
//
//    val lazy = instruments.asSequence().filter { it [0] == 'v' }
//    println("lazy: " + lazy)
//    println("lazy list: " + lazy.toList())
//
//    val numbers = setOf(1, 2, 3)
//    println(numbers.map { (it + 3) * 2 })
//
//    // [[1,2,3],[4,5],[1,2]]
//    // [1,2,3,4,5,1,2]
//    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
//    println(numberSets.flatten())
//}

fun main(){
    val kelas2c = listOf("martin","wahyu","ahmad","ilham","zidni")
    val kelas2d = listOf("abdul","aziz","eka","fawwaz","maulan")

    val filter2c = kelas2c.filter { it[0] == 'a' }
    val filter2d = kelas2d.filter { it[0] == 'a' }
    val flat = listOf(filter2c, filter2d).flatten()
    println(flat)

    val flat2 = listOf(kelas2c, kelas2d).flatten().filter { it[0] == 'a'}.map { "Hello $it" }
    println(flat2)
}