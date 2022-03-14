package com.example.myapplication.ui.activities.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.network.ResponseState
import com.example.myapplication.ui.activities.main.MainActivity
import timber.log.Timber


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel: LoginViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = binding.username
        val password = binding.password
        val login = binding.loginButton
        val loading = binding.loading


        username.addTextChangedListener {
            val flag = !(username.text.isNullOrEmpty() || password.text.isNullOrEmpty())
            login.isEnabled = flag
        }
        password.addTextChangedListener {
            val flag = !(username.text.isNullOrEmpty() || password.text.isNullOrEmpty())
            login.isEnabled = flag
        }

        viewModel.responseState.observe(this) {
            loading.isVisible = false
            when (it) {
                ResponseState.SUCCESSFUL -> {
                    Toast.makeText(
                        baseContext,
                        resources.getString(R.string.auth_successful),
                        Toast.LENGTH_SHORT
                    ).show()
                    viewModel.setSharedPreferences(baseContext, buildPreviewHash())
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                ResponseState.FAILED -> {
                    Toast.makeText(
                        baseContext,
                        resources.getString(R.string.auth_failed),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                ResponseState.ERROR -> {
                    Toast.makeText(
                        baseContext,
                        resources.getString(R.string.auth_error),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                ResponseState.LOADING -> {
                    loading.isVisible = true
                }
                else -> {
                    Timber.d("None")
                }
            }
        }
        login.setOnClickListener {
            val result = buildPreviewHash()
            viewModel.sendQuery(result)
            // Timber.d("hash: ${md5(result).toHex()}")
        }
    }

    private fun buildPreviewHash() =
        binding.password.text.toString() + binding.username.text.toString()

}
