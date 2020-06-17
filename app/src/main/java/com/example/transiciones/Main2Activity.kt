package com.example.transiciones

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botonsito3 = findViewById<Button>(R.id.boton3cambio)
        val botonsito4 = findViewById<Button>(R.id.boton4brack)
        val fondo2      =findViewById<LinearLayout>(R.id.todo2)

        botonsito3.setOnClickListener {
            val intent3 =Intent(this@Main2Activity,MainActivity::class.java)
            startActivity(intent3)
        }
        botonsito4.setOnClickListener {
            fondo2.setBackgroundColor(Color.parseColor("#FFA000"))
        }

    }
}
