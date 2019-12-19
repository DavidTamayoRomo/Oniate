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

            var vehiculo=findViewById<EditText>(R.id.edVehiculo)
            var matricula=findViewById<EditText>(R.id.edMatricula)
            var modelo=findViewById<EditText>(R.id.edModelo)
            var refrigerante=findViewById<EditText>(R.id.edRefrigerante)
            var lubricante=findViewById<EditText>(R.id.edLubricante)

            var option = findViewById<Spinner>(R.id.spinner)
            val text = option.getSelectedItem().toString()

            var campos = ArrayList<String>()

            campos.add(vehiculo.text.toString())
            campos.add(matricula.text.toString())
            campos.add(text)
            campos.add(modelo.text.toString())
            campos.add(refrigerante.text.toString())
            campos.add(lubricante.text.toString())


            var variable =VehiculoModel(campos.get(0),campos.get(1),campos.get(2),campos.get(3),campos.get(4),campos.get(5))

            Toast.makeText(this,"Vehiculo Creado"+variable.matricula,Toast.LENGTH_LONG).show()

            val intent = Intent(this, Procesos::class.java)
            startActivity(intent)
        }


        var option = findViewById<Spinner>(R.id.spinner)

        val options= arrayOf("Sedan","Coupe","HatchBack","Todo Terreno","Suv","Camion")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)








    }
}
