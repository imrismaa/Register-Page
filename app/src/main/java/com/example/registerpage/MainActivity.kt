package com.example.registerpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registerpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    companion object {
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnRegister.setOnClickListener {
                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
                val username = editTxtUsername.text.toString()
                intentToSecondActivity.putExtra(EXTRA_NAME, username)
                startActivity(intentToSecondActivity)
            }
        }
    }
}