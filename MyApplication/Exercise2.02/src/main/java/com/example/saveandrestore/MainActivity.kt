package com.example.saveandrestore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//TOO Saving and restoring the activity state
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
