package lab.binz.mobilesatu.ti2c

class House {
    val color: String = "white"
    val numberOfWindows: Int = 2
    val isForSale: Boolean = false

    fun updateColor(newColor: String){

    }

    fun putOnSale(status: Boolean){

    }
}

class A(){
    val a = "Text A"
}

class B(x: Int){
    val x = x
}

class C(val x: Int){

}

class Box(val length: Int, val width:Int = 20, val height:Int = 40){
//    val volume = length*width*height
}

fun main(){
    val box1 = Box(100,20,40)
    val box2 = Box(100)
    val box3 = Box(length = 100, 20)

    println(box1)
    println(box2)
    println(box3)

//    val aa = A()
//    println(aa.a)
//
//    val bb = B(12)
//    println(bb.x)
//
//    val cc = C(24)
//    println(cc.x)
//    val myHouse = House()
//    val neighHouse = House()
//    println(myHouse)
//    println(myHouse.color)
//    println(neighHouse)
//    println(neighHouse.color)
}