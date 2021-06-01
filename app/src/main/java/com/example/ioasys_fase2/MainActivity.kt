package com.example.ioasys_fase2

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.navHostFragment) }
    private val COMMON_TAG: String = "OrientationChange"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragmentLogin = LoginFragment()
//        supportFragmentManager.beginTransaction().replace(R.id.welcomeText, fragmentLogin).commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.i(COMMON_TAG, "Landscape")
        }
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.i(COMMON_TAG, "Portrait")
        }
    }

//    override fun passDataLoginToMenu(editTextInput: String?) {
//        val bundle = Bundle()
//        bundle.putString("username", editTextInput)
//        val transaction = this.supportFragmentManager.beginTransaction()
//        val menuFragment = MenuFragment()
//        menuFragment.arguments = bundle
//        transaction.replace(R.id.welcomeText, menuFragment)
//        transaction.commit()
//    }
}