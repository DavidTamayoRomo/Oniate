package com.david.sistemamantenimientoac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInicio = findViewById<Button>(R.id.btnInicio)

        btnInicio.setOnClickListener {

            val intent = Intent(this, DatosVehiculo::class.java)
            startActivity(intent)
        }
    }


}
