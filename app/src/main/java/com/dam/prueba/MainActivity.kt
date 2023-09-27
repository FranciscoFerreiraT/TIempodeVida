package com.dam.prueba


import android.util.Log
import androidx.activity.ComponentActivity

import android.widget.Toast

class MainActivity : ComponentActivity() {

    val TAG ="Estado"
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        Log.d(TAG,"OnStart")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        Log.d(TAG,"OnResume")
    }

    override fun onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        super.onPause()
        Log.d(TAG,"OnPause")
    }

    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
        Log.d(TAG,"OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        Log.d(TAG,"OnRestart")
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
        Log.d(TAG,"OnDestroy")
    }


}



