package com.example.myapplication.ui.activities.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel: LoginViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = binding.username
        val password = binding.password
        val login = binding.login
        val loading = binding.loading

        username.addTextChangedListener {
            login.isEnabled = !(username.text.isNullOrEmpty() || password.text.isNullOrEmpty())
        }
        password.addTextChangedListener {
            login.isEnabled = !(username.text.isNullOrEmpty() || password.text.isNullOrEmpty())
        }
        login.setOnClickListener {
            val result = password.text.toString() + username.text.toString()
            viewModel.sendQuery(result)
            // Timber.d("hash: ${md5(result).toHex()}")
        }
    }

}
