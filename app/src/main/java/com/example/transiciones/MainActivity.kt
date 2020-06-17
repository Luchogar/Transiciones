package com.example.transiciones

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonsito1 = findViewById<Button>(R.id.boton1cambio) as Button
        val botonsito2 = findViewById<Button>(R.id.boton2brack) as Button
        val fondo = findViewById<LinearLayout>(R.id.todo)

        botonsito1.setOnClickListener {
            val intent=Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(intent)
        }

        botonsito2.setOnClickListener {
            fondo.setBackgroundColor(Color.parseColor("#FFCDD2"))
        }

    }
}
