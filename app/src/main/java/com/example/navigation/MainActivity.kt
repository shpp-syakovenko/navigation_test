package com.example.navigation

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.navOptions
import androidx.navigation.ui.NavigationUI
import com.example.navigation.fragment.FragmentTwoArgs
import com.example.navigation.fragment.FragmentTwoDirections

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = host.navController

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            run {
                Toast.makeText(this, "${destination.label}", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        NavigationUI.onNavDestinationSelected(item, navController)
        return super.onOptionsItemSelected(item)
    }

    fun onClickFragmentOneBack(view: View) {
    }

    fun onClickFragmentOneNext(view: View) {
        navController.navigate(R.id.fragmentTwo, FragmentTwoArgs("Sergey",32).toBundle())
    }
    fun onClickFragmentTwoBack(view: View) {
        navController.popBackStack()
    }
//    fun onClickFragmentTwoNext(view: View) {
//        navController.navigate(FragmentTwoDirections.actionFragmentTwoToFragmentThree("SERGEY",32))
//    }
    fun onClickFragmentThreeNext(view: View) {
        navController.navigate(R.id.secondActivity)
    }
    fun onClickFragmentThreeBack(view: View) {
        navController.popBackStack()
    }
}