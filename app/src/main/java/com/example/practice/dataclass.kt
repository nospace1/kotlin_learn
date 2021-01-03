package com.example.practice

// 2. Data class
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// toString(), hashCode(), equals(), copy()
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)


fun main(){
    val ticketA = Ticket("koreanAir", "joyceHong", "2020-02-16", 14)
    val ticketB = TicketNormal("koreanAir", "joyceHong", "2020-02-16", 14)

    println(ticketA) // 내용 출력
    println(ticketB) // 주소값 출력
}