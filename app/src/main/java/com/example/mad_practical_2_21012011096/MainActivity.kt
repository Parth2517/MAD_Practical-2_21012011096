package com.example.mad_practical_2_21012011096

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("OnResume() method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause() Method called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop() method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy() Method is called")
    }

    fun showMessage(msg: String) {
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        var v = findViewById<ConstraintLayout?>(R.id.Parth96)
        if (v != null) {
            Snackbar.make(v, msg, Snackbar.LENGTH_SHORT).show()

        }
    }
}