package com.example.kotlin

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View.inflate
import android.widget.*

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

        //Image View
        /*val btnShow = findViewById<Button>(R.id.btn_show);
        var imageView = findViewById<ImageView>(R.id.imageView);

        btnShow.setOnClickListener {
            imageView.setImageResource(R.drawable.ic_launcher_background);
        }*/

        //RadioButtons and Checkbox
        /*findViewById<Button>(R.id.btn_order).setOnClickListener {
            val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
            val checkedRadioButtonId = radioGroup.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(checkedRadioButtonId)

            val one = findViewById<CheckBox>(R.id.one).isChecked
            val two = findViewById<CheckBox>(R.id.two).isChecked
            val three = findViewById<CheckBox>(R.id.three).isChecked

            val textView = findViewById<TextView>(R.id.order_text)

            textView.text = "Your order is \n" +
                    "${radioButton.text}" +
                    (if (one) "\n one" else "") +
                    (if (two) "\n two" else "") +
                    (if (three) "\n three" else "")
                    }*/

        //Toasts and Context
        /* findViewById<Button>(R.id.showToast).setOnClickListener {

             Toast(this).apply {
                 duration = Toast.LENGTH_LONG
                 view = layoutInflater.inflate(
                     R.layout.custom_toast,
                     findViewById<LinearLayout>(R.id.toast)
                 )
                 show()
             }
         }*/


        //Intents and share data between activities
        /*findViewById<Button>(R.id.openActivity2).setOnClickListener {

            val person = Person("Hi I am from First Activity")
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_TEXT", person)
                startActivity(it)
            }
        }*/

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.delete -> Toast.makeText(this, "I am Delete", Toast.LENGTH_LONG).show()
            R.id.icon -> Toast.makeText(this, "I am Icon", Toast.LENGTH_LONG).show()
        }

        return true
    }
}