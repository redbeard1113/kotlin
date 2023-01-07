package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        val etusername = findViewById(R.id.username_et) as EditText
        val etpassword = findViewById(R.id.password_et) as EditText
        val loginbtn = findViewById(R.id.login_button) as Button

        loginbtn.setOnClickListener {
            // validate
            var status = if (etusername.text.toString().equals("giahuy")
                && etpassword.text.toString().equals("123456789"))
                "Login successfully"  else "Login unsuccessfully"

            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }
    }
}

