package com.david.sistemamantenimientoac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class DatosVehiculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_vehiculo)

        val btGuardar = findViewById<Button>(R.id.btnGuardar)

        btGuardar.setOnClickListener {
            val intent = Intent(this, Procesos::class.java)
            startActivity(intent)
        }


        var option = findViewById<Spinner>(R.id.spinner)

        val options= arrayOf("Sedan","Coupe","HatchBack","Todo Terreno","Suv","Camion")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)


    }
}
