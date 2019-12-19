package com.david.sistemamantenimientoac

import android.R.attr.name



class VehiculoModel(vehicuolo:String,matricula:String,modelo:String,tipo:String,refrigerante:String,lubricante:String) {
    var vehicuolo:String = ""
    var matricula:String = ""
    var modelo:String = ""
    var tipo:String = ""
    var refrigerante:String = ""
    var lubricante:String = ""

    init{
        this.vehicuolo =vehicuolo
        this.matricula =matricula
        this.modelo =modelo
        this.tipo =tipo
        this.refrigerante =refrigerante
        this.lubricante =lubricante
    }

    fun getVehiculo(): String {
        return vehicuolo
    }

}