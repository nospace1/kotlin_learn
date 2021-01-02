package com.example.practice

//fun main(){
//    helloworld()
//
//    println(add(4, 5))
//}

// 1. 함수
fun helloworld(){
    println("Hello World!!!!!!!")
}
// fun 함수이름( 변수명) : 리턴 값 {}
fun add(a : Int, b: Int) : Int {
    return a + b
}

// 2. val vs var
// val = value
// val 변경 불가능 var 변경 가능
fun hi(){
    val a : Int = 10

    var b : Int = 9

    var e : String

    // a = 100 val can not be assigned
    b = 100 // 사용하지 않으면 회색으로 뜸

    val c = 100 // val c : Int = 100  Int를 써주지 않아도 된다. --> 자동추론이기 때문에
    var d = 100

    var name : String = "joyce"
}

// 3. String Template
//fun main() {
//    val name = "joyce"
//    val lastName = "Hong"
//    println("my name is ${name + lastName}. I'm 23")
//
//    println("is this true? ${1==0}")
//
//    println("this is 2\$a") // $를 표시하고 싶으면 백슬래쉬를 앞에 표시
//}



// 4, 조건식














