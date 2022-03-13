package com.example.myapplication.ui.activities.main

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.*
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.example.myapplication.R
import com.example.myapplication.ui.activities.login.LoginActivity
import timber.log.Timber

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private val navController: NavController by lazy {
        Navigation.findNavController(this, R.id.nav_host_fragment)
    }
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var toggle: ActionBarDrawerToggle
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.staffFragment,
                R.id.rewardsFragment,
                R.id.statisticsFragment
            ), binding.drawerLayout
        )


        toggle =
            ActionBarDrawerToggle(this, binding.drawerLayout, R.string.app_name, R.string.app_name)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
        viewModel.initClient(baseContext)
    }


    override fun onBackPressed() {

        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.rewardsFragment, R.id.staffFragment, R.id.statisticsFragment -> {
                navController.navigate(item.itemId)
            }
            R.id.refresh -> {
                Timber.d("refreshed")
            }
            R.id.exit -> {
                viewModel.restoreClient(baseContext)
                val intent = Intent(baseContext, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsMenuClosed(menu: Menu?) {

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.exit -> {
                viewModel.restoreClient(baseContext)
                val intent = Intent(baseContext, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        return NavigationUI.onNavDestinationSelected(
            item,
            navController
        ) || super.onOptionsItemSelected(item)
    }

}
