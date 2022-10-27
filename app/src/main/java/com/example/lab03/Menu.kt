package com.example.lab03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        /**/
        val boton1=findViewById<Button>(R.id.button_posRegistro)
        boton1.setOnClickListener{
            val lanzar= Intent(this,PostulanteRegistro::class.java)
            startActivity(lanzar)
        }
        /**/
        val boton2=findViewById<Button>(R.id.button_posInfo)
        boton2.setOnClickListener{
            val lanzar=Intent(this,PostulanteInfo::class.java)
            startActivity(lanzar)
        }
    }
}