package com.example.registerpage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.registerpage.MainActivity.Companion.EXTRA_NAME
import com.example.registerpage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_NAME)

        with(binding) {
            txtUsername.text = "Welcome $username!"

            btnLogout.setOnClickListener {
                val intentToMainActivity = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}