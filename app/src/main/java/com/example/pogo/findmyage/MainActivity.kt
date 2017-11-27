package com.example.pogo.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        buFindAge.text = "Find age"
//        buFindAge.setOnClickListener {
//
//
//
//        }


    }

    fun buFindAgeEvent(view:View){
        val yearOfBirth = txtYearOfBirth.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val invalidYear = 0
        if (yearOfBirth >= currentYear) {
            tvShowAge.text = "Invalid input. Please put in your correct year"
            return
        }
        val myAge = currentYear - yearOfBirth

        tvShowAge.text = "Your age is $myAge"



    }

}
