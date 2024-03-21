package com.example.intentbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PresentationActivity : AppCompatActivity() {
    private lateinit var nombreDisplay: TextView
    private lateinit var edadDisplay: TextView
    private lateinit var backBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentation)
        val bundle = intent.extras
        val nombre = bundle?.getString("nombre") ?: "Sin Nombre"
        val edad = bundle?.getString("edad") ?: "0"

        nombreDisplay=findViewById(R.id.tv_nombrePres)
        edadDisplay=findViewById(R.id.tv_edadPres)
        backBtn=findViewById(R.id.pres_back_btn)
        nombreDisplay.text=nombre
        edadDisplay.text=edad

        backBtn.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}