package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /*val string = intent.getSerializableExtra("EXTRA_TEXT") as Person
        Toast.makeText(this, string.toString(), Toast.LENGTH_LONG).show()*/

        /* findViewById<Button>(R.id.openActivity1).setOnClickListener {
             finish()
         }*/
    }
}