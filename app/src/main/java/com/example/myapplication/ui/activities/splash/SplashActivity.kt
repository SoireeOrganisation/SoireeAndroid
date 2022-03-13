package com.example.myapplication.ui.activities.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myapplication.R
import com.example.myapplication.ui.activities.login.LoginActivity
import com.example.myapplication.ui.activities.main.MainActivity

class SplashActivity : AppCompatActivity() {

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val intent = Intent(
            baseContext,
            if (viewModel.isLogged(baseContext)) MainActivity::class.java else LoginActivity::class.java
        )
        startActivity(intent)
        finish()
    }
}