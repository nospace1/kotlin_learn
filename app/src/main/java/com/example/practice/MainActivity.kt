package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = nav_host_fragment.findNavController()

//        button.setOnClickListener (object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                // to do
//            }
//
//        })
//
//        // 1. kotlin interface가 아닌 자바 인터페이스여야 한다.
//        // 2. 그 인터페이스는 딱 하나의 메소드를 가져야 한다.
//
//        button.setOnClickListener {
//            // to do
//        }
    }
}