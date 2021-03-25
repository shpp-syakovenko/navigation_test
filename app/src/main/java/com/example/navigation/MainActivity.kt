package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.fragment.FragmentOne
import com.example.navigation.fragment.FragmentOneDirections

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = host.navController

    }

    fun onClickFragmentOneBack(view: View) {
    }
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    fun onClickFragmentOneNext(view: View) {

        val action = FragmentOneDirections.actionFragmentOneToFragmentTwo()

        navController.navigate(action)
    }
    fun onClickFragmentTwoBack(view: View) {
        navController.popBackStack()
    }
    fun onClickFragmentTwoNext(view: View) {
        navController.navigate(R.id.fragmentThree)
    }
    fun onClickFragmentThreeNext(view: View) {
        navController.navigate(R.id.secondActivity)
    }
    fun onClickFragmentThreeBack(view: View) {
        navController.popBackStack()
    }
}