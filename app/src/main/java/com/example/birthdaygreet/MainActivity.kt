package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdayCard(view: View) {     //function which handle on create button event
        val name = editTextTextPersonName.editableText.toString()   //covert name to string with removing editabletext
//        Toast.makeText(this, "name is $name", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,BirthdayGreetingActivity::class.java )
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)    //key pair to pass to birthday extent
        startActivity(intent)   //require to start activity

    }
}