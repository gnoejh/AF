package com.example.saveandrestore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//TODO Saving and Restoring the State in Layouts
//default rotation pause
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
