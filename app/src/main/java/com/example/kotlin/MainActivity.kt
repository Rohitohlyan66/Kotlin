package com.example.kotlin

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.kotlin.fragments.FirstFragment
import com.example.kotlin.fragments.FragmentOne
import com.example.kotlin.fragments.FragmentSecond
import com.example.kotlin.fragments.FragmentThree
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    val CHANNEL_ID = "channelID"
    val CHANNEL_NAME = "channelName"
    val NOTIFICATION_ID = 0

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


        //------------------------------------------------Fragments---------------------------------------------------------------------------------------
        /*val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, firstFragment)
            commit()
        }

        findViewById<Button>(R.id.buttonOne).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        findViewById<Button>(R.id.buttonTwo).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, secondFragment)
                addToBackStack(null)
                commit()
            }
        }*/

        //----------------------------------------------Bottom Navigation with fragments-------------------------------------------------------------
        /*val first = FragmentOne()
        val second = FragmentSecond()
        val third = FragmentThree()

        setFragment(first)

        findViewById<BottomNavigationView>(R.id.nav_bar).setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.one -> setFragment(first)
                R.id.two -> setFragment(second)
                R.id.three -> setFragment(third)
            }
            true
        }*/


        //--------------------------------------------------Swipable Views and Tab Layout------------------------------------------------------------------------------
        /*  val images = listOf(
              R.drawable.ic_launcher_background,
              R.drawable.ic_launcher_foreground,
              R.drawable.ic_launcher_background,
              R.drawable.ic_launcher_foreground,
              R.drawable.ic_launcher_background,
              R.drawable.ic_launcher_foreground,
          )


          val adapter = ViewPagerAdapter(images)
          val tabs = findViewById<TabLayout>(R.id.tabs)
          val pager2 = findViewById<ViewPager2>(R.id.view_pager2)
          pager2.adapter = adapter
          pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

          TabLayoutMediator(tabs, pager2) { tab, position ->
              tab.text = "Tab ${position + 1}"
          }.attach()

          tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
              override fun onTabReselected(tab: TabLayout.Tab?) {
                  Toast.makeText(this@MainActivity, "Tab Reselected ${tab?.text}", Toast.LENGTH_LONG)
                      .show()
              }

              override fun onTabUnselected(tab: TabLayout.Tab?) {
                  Toast.makeText(this@MainActivity, "Tab Unselected ${tab?.text}", Toast.LENGTH_LONG)
                      .show()
              }

              override fun onTabSelected(tab: TabLayout.Tab?) {
                  Toast.makeText(this@MainActivity, "Tab Selected ${tab?.text}", Toast.LENGTH_LONG)
                      .show()

              }
          })*/


        //------------------------------------------------------Navigation Drawer-------------------------------------------------------------------
        /*var drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<NavigationView>(R.id.nav_bar).setNavigationItemSelectedListener {
            Toast.makeText(this, it.title.toString(), Toast.LENGTH_LONG).show()
            true
        }*/


        //----------------------------------------------------------SharedPreferences------------------------------------------------------------------
        /* val name = findViewById<EditText>(R.id.name)
         val age = findViewById<EditText>(R.id.age)
         val save = findViewById<Button>(R.id.save)
         val load = findViewById<Button>(R.id.load)
         val adult = findViewById<CheckBox>(R.id.adult)

         val sharePref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
         val editor = sharePref.edit()

         save.setOnClickListener {
             editor.apply {
                 putString("name", name.text.toString())
                 putInt("age", age.text.toString().toInt())
                 putBoolean("isAdult", adult.isChecked)
                 apply()
             }
         }

         load.setOnClickListener {
             val names = sharePref.getString("name", null)
             val ages = sharePref.getInt("age", 0)
             val isAdult = sharePref.getBoolean("isAdult", false)

             name.setText(names)
             age.setText(ages.toString())
             adult.isChecked = isAdult
         } */

        //--------------------------------------------Notifications--------------------------------------------------------------------------------
        /*val notifyButton = findViewById<Button>(R.id.notify)
        createNotificationChannel()

        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)

        }

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .apply {
                setContentTitle("Awesome Notification")
                setContentText("My First Notification")
                setSmallIcon(R.drawable.ic_launcher_foreground)
                priority = NotificationCompat.PRIORITY_HIGH
                setContentIntent(pendingIntent)
            }
            .build()


        val notificationManager = NotificationManagerCompat.from(this)

        notifyButton.setOnClickListener {
            notificationManager.notify(NOTIFICATION_ID, notification)
        } */


    }


    /*private fun setFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragment_container, fragment)
        commit()
    } */

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

    /*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }*/

    /*private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID, CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                lightColor = Color.GREEN
                enableLights(true)
            }
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }*/
}