package com.example.practice

// Singleton Pattern : 한번만 객체를 생성 ex) Car
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}