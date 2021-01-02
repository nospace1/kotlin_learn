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
fun maxBy(a : Int, b : Int) : Int {
    if (a >b) {
        return a
    }else{
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if(a>b) a else b // 위 함수랑 같다.

//fun main(){
//    checkNum(1)
//}

fun checkNum(score : Int) : Unit {
    when(score) { // Statement
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know") // else가 없어도 작동함.
    }

    var b = when(score){ // Expression
        1 -> 1
        2 -> 2
        else -> 3 // else를 반드시 써주어야 한다.
    }

    println("b : ${b}")

    when(score){ //
        in 90..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else -> println("okay")
    }
}

// Expression vs Statement
// kotlin의 모든 함수는 Expression으로 존재한다.
// Expression: 값을 출력한다. Statment: 문장 형태로 결과 출력 X

// 5. Array and List
// Array

// List 1. List --> 읽기 전용 2. MutableList --> 읽기와 쓰기 모두 가능

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    // list[0] = 2 --> ERROR / list.get(0) 으로 정보를 가져올 수 있다.
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20) // lista listb
    // 구성원은 바뀔 수 없어도 추가 가능

    // arrayList = arrayListOf() Val cannot be assigned


}

// 6. For / While
//fun main(){
//    forAndWith()
//}

fun forAndWith(){
    val students  = arrayListOf("joyce", "james","jenny", "jennifer")

    for( name in students){
        println(name)  // println("${name}")
    }
    var sum  = 0
    for (i in 1..10 step 2){
        sum += i
    }
    println(sum)

    var sum1  = 0
    for (i in 10 downTo 1){
        sum1 += i
    }
    println(sum1)

    var sum2  = 0
    for (i in 1 until 100){ // 1부터 99까지
        sum2 += i
    }
    println(sum2)

    var index =0
    while(index < 10){
        println("current index : ${index}")
        index++
    }

    for ((index, name) in students.withIndex()){ // withIndex()를 붙여서 index = 0 .. ~ 값을 출력하게 해준다. 따로 초기값을 설정할 필요 없음.
        println("${index+1}번째 학생 : ${name}")

    }
}

// 7. Nullable / NonNull
fun main(){
    nullcheck()
    ignoreNulls("w")
}

fun nullcheck(){
    //NPE : Null pointer Exception

    var name : String = "joyce"

    var nullName : String? = null // 변수값이 null를 넣고 싶으면 type에 ?를 붙이기

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase() // ? : null 아니면 toUpperCase하고 null이면 null를 반환

    // ?:

    val lastName : String? = null

    val fullName = name + " " + (lastName?: "No lastName") // 엘비스 연산자 : null이면 No lastName 반환 null이 아니면 해당 문자 반환
    println(fullName)

}

// !! --> 내가 이거 null 아닌거 보증해 줄께!
fun ignoreNulls(str: String?){
    val mNotNull : String = str!! // 이건 null 절대 안들어와! 확실할 때만 사용! 지양하길 바람
    val upper = mNotNull.toUpperCase()

    val email : String? = "joycehong@gmail.com"
    email?.let { // null이 아니라면 email 변수에 넣어줌
        println("my email is ${email}")
    }
}






















