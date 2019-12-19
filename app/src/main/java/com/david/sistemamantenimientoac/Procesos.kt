package com.david.sistemamantenimientoac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Procesos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procesos)

        var btnCarga = findViewById<Button>(R.id.btnCarga)
        var btnDescarga = findViewById<Button>(R.id.btnDescarga)
        var btnVacio = findViewById<Button>(R.id.btnVacio)

        btnCarga.setOnClickListener {
            val intent = Intent(this, Carga::class.java)
            startActivity(intent)
        }

        btnDescarga.setOnClickListener {
            val intent = Intent(this, Descarga::class.java)
            startActivity(intent)
        }

        btnVacio.setOnClickListener {
            val intent = Intent(this, PruebaDeVacio::class.java)
            startActivity(intent)
        }

    }
}
