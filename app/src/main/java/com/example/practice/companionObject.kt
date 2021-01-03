package com.example.practice

class Book private constructor(val id : Int, val name : String){ // private constructor : 다른곳에서 만들 수 없게 함.

    companion object BookFactory : IdProvider{

        override fun getId(): Int {
            return 44
        }

        val myBook = "new book"

        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()
    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
}