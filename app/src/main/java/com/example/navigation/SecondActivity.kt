package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

class SecondActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val host = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }

    fun onClickFragmentFourBack(view: View) {
        finish()
    }
    fun onClickFragmentFourNext(view: View) {
        val bundle = Bundle()
        bundle.putString("keyValue", "value")
        bundle.putInt("keyInt",10)
        navController.navigate(R.id.fragmentFive, bundle)
    }
    fun onClickFragmentFiveBack(view: View) {
        navController.popBackStack()
    }
    fun onClickFragmentFiveNext(view: View) {}
}