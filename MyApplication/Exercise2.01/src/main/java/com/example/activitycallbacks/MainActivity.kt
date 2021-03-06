package com.example.activitycallbacks

import android.os.Bundle
//TODO
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

//TODO Activity Lifecycle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO v, d, i, w, e, wtf for Logcat
        Log.d(TAG, "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    //TODO Uncomment callback to see this callback on rotation
//    override fun onconfigurationchanged(newconfig: configuration) {
//        super.onconfigurationchanged(newconfig)
//        log.d(tag, "onconfigurationchanged")
//    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    //TODO static functionality to classes
    //singleton
    companion object {
        private const val TAG = "MainActivity"
    }
}
