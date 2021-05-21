package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Working with Buttons
        /*
        var submit = findViewById<Button>(R.id.btn_submit)
         submit.setOnClickListener{
             val name = findViewById<EditText>(R.id.et_firstName).text.toString();
             val username = findViewById<EditText>(R.id.et_username).text.toString()
             val address = findViewById<EditText>(R.id.et_address).text.toString()
             val gender = findViewById<EditText>(R.id.et_gender).text.toString()

             Log.d("MainActivity", "$name $username $address $gender")
         } */

        //Working with TextViews
        /*var value = 0
        var increase = findViewById<Button>(R.id.btn_increase);
        var count = findViewById<TextView>(R.id.tv_count);

        increase.setOnClickListener {
            value++
            count.text = "Let's count together $value"
        }*/


    }
}