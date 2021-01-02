package com.example.practice

class ClassPractice{

}

open class Human constructor(val name : String = "Anonymous"){ // constructor 생략 가능 // name default값 설정

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    init {
        println("New human has been born!!") // 주생성자의 일부
    }

    // val name = name

    fun eatingCake(){
        println("This is so Yummmy")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){ // 상속은 하나밖에 못함
    override fun singASong(){
        super.singASong() // 부모의 function과 자식의 function 모두 사용
        println("라라라")
        println("my name is ${name}")
    }
}


fun main(){
    val korean = Korean()
    korean.singASong()
//    val stranger = Human()
//    val human = Human("minsu")
//    human.eatingCake()

    val mom = Human("Kuri", 52)
//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}")

}