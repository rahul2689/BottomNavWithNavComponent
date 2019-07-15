package com.android.navigationpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpNavigationView()
    }

    private fun setUpNavigationView() {
        val navigationController = Navigation.findNavController(this@MainActivity, R.id.mainNavigationFragment)
        setupActionBarWithNavController(navigationController)
        NavigationUI.setupWithNavController(bottomNavigationView, navigationController)
    }

    override fun onSupportNavigateUp() =
        Navigation.findNavController(this@MainActivity, R.id.mainNavigationFragment).navigateUp()
}

