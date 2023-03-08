package com.theinternational.appsatu.model

class Circle(val radius:Double) {
    constructor(name:String) : this(2.0)
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }

    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}



