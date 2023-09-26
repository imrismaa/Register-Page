package com.example.registerpage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
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
                if (editTxtUsername.text.isEmpty() || editTxtEmail.text.isEmpty() || editTxtPhone.text.isEmpty() || editTxtPassword.text.isEmpty()){
                    val warning = "Please fill out the blank."
                    Toast.makeText(this@MainActivity, warning, Toast.LENGTH_SHORT).show()
                }
                else{
                    if (checkbox.isChecked){
                        val intentToSecondActivity =
                            Intent(this@MainActivity, SecondActivity::class.java)
                        val username = editTxtUsername.text.toString()
                        intentToSecondActivity.putExtra(EXTRA_NAME, username)
                        startActivity(intentToSecondActivity)
                    }
                    else{
                        val termsAndCondition = "Please read and agree to our Terms and Conditions before proceeding."
                        Toast.makeText(this@MainActivity, termsAndCondition, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}