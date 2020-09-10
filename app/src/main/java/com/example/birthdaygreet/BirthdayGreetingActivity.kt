package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{           //used to creat static object
        const val NAME_EXTRA = "name_extra"        //static as it remain same
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)  // recive data at recivuing end  we pass key here
        birthdayGreeting.text = "Happy Birthday\n$name!"  // message
    }
}