package com.example.kotlin

import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.inflate
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //----------------------------------------------------Working with Buttons-----------------------------------------------
        /*
        var submit = findViewById<Button>(R.id.btn_submit)
         submit.setOnClickListener{
             val name = findViewById<EditText>(R.id.et_firstName).text.toString();
             val username = findViewById<EditText>(R.id.et_username).text.toString()
             val address = findViewById<EditText>(R.id.et_address).text.toString()
             val gender = findViewById<EditText>(R.id.et_gender).text.toString()

             Log.d("MainActivity", "$name $username $address $gender")
         } */


        //-----------------------------------------------------Working with TextViews---------------------------------------------
        /*var value = 0
        var increase = findViewById<Button>(R.id.btn_increase);
        var count = findViewById<TextView>(R.id.tv_count);
      
        increase.setOnClickListener {
            value++
            count.text = "Let's count together $value"
        }*/


        //--------------------------------------------------------Image View----------------------------------------------------------
        /*val btnShow = findViewById<Button>(R.id.btn_show);
        var imageView = findViewById<ImageView>(R.id.imageView);

        btnShow.setOnClickListener {
            imageView.setImageResource(R.drawable.ic_launcher_background);
        }*/


        //-------------------------------------------------------RadioButtons and Checkbox------------------------------------------------
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

        //-----------------------------------------------------------------Toasts and Context---------------------------------------------------
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


        //----------------------------------------------------------Intents and share data between activities--------------------------------------
        /*findViewById<Button>(R.id.openActivity2).setOnClickListener {

            val person = Person("Hi I am from First Activity")
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_TEXT", person)
                startActivity(it)
            }
        }*/


        //-------------------------------------------------------------------Alert Dialogs------------------------------------------------------------
        /*findViewById<Button>(R.id.one).setOnClickListener {
            val dialogOne =
                AlertDialog.Builder(this).setTitle("ALert Dialog").setMessage("This is dialog one")
                    .setIcon(R.drawable.ic_launcher_background).setPositiveButton("Yes") { _, _ ->
                        Toast.makeText(this, "You Pressed Yes", Toast.LENGTH_LONG).show()
                    }
                    .setNegativeButton("No") { _, _ ->
                        Toast.makeText(this, "You Pressed No", Toast.LENGTH_LONG).show()
                    }.create().show()
        }


        findViewById<Button>(R.id.two).setOnClickListener {
            val options = arrayOf("Item 1", "Item 2", "Item3")
            val choiceDialog = AlertDialog.Builder(this).setTitle("Choose One Option")
                .setSingleChoiceItems(options, 0) { _, which ->
                    Toast.makeText(this, "You Pressed ${options[which]}", Toast.LENGTH_LONG).show()
                }.setPositiveButton("Accept") { _, _ ->
                    Toast.makeText(this, "You Accepted ", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Decline") { _, _ ->
                    Toast.makeText(this, "You Declined", Toast.LENGTH_LONG).show()
                }.create().show()
        }*/


        //---------------------------------------------------Spinner---------------------------------------------------------------------------------
        /*findViewById<Spinner>(R.id.spinner).onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener,
                AdapterView.OnItemClickListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(
                        this@MainActivity,
                        parent?.getItemAtPosition(position).toString(), Toast.LENGTH_LONG
                    )
                        .show()
                }

                override fun onItemClick(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                }
            }*/


        //--------------------------------------------Recycler View-----------------------------------------------------------------------------------
        /* val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
         val list = mutableListOf(
             Todos("Title 1", false),
             Todos("Title 2", true),
             Todos("Title 3", false),
             Todos("Title 4", true),
             Todos("Title 5", false),
             Todos("Title 6", true)
         )

         val adapter: RecyclerAdapter = RecyclerAdapter(list)
         recyclerView.adapter = adapter
         recyclerView.layoutManager = LinearLayoutManager(this) */


    }


    //---------------------------------------------------Toolbar Menu Items---------------------------------------------------------------------------

    /* override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.delete -> Toast.makeText(this, "I am Delete", Toast.LENGTH_LONG).show()
            R.id.icon -> Toast.makeText(this, "I am Icon", Toast.LENGTH_LONG).show()
        }

        return true
    }*/
}