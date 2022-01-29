package com.example.intentsintroduction

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//TODO
const val FULL_NAME_KEY = "FULL_NAME_KEY"

//TODO Introduction to Intent
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submit_button).setOnClickListener {

            val fullName = findViewById<EditText>(R.id.full_name).text.toString().trim()

            if (fullName.isNotEmpty()) {

                //TODO Set the name of the Activity to launch
                Intent(this, WelcomeActivity::class.java)
                    .also { welcomeIntent ->
                        //Add the data, lambda expression, welcomeIntent instead of default it
                        welcomeIntent.putExtra(FULL_NAME_KEY, fullName)
                        //Launch
                        startActivity(welcomeIntent)
                    }

            } else {
                Toast.makeText(this, getString(
                    R.string.full_name_label),
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}
