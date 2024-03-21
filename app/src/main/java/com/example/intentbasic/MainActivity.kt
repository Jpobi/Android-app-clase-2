package com.example.intentbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var nombre: String
    private lateinit var nombreInput: EditText
    private lateinit var edad: String
    private lateinit var edadInput: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //println("Estoy OnCreate() $nombre")
        //cambio
        button= findViewById(R.id.main_continue_button)
        nombreInput=findViewById(R.id.editNombre)
        edadInput=findViewById(R.id.editTextNumber)
        button.setOnClickListener{
            nombre=nombreInput.text.toString()
            edad=edadInput.text.toString()
            val intent= Intent(this,PresentationActivity::class.java)
            intent.putExtra("nombre",nombre)
            intent.putExtra("edad",edad)
            startActivity(intent)
        }
    }

    /*override fun onStart() {
        super.onStart()
        println("Estoy OnStart() $nombre")
    }

    override fun onResume() {
        super.onResume()
        println("Estoy OnResume() $nombre")
    }

    override fun onPause() {
        super.onPause()
        nombre="Juan"
        println("Estoy OnPause() $nombre")
    }

    override fun onStop() {
        super.onStop()
        println("Estoy OnStop() $nombre")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Estoy OnDestroy() $nombre")
    }*/
}