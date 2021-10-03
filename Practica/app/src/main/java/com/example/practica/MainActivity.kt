package com.example.practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     Trabajador("Laura", 30.00, 8,7)


        var trabajador = Trabajador()
        trabajador.sueldo = 300
        trabajador.nombre = "Jonathan"
        trabajador.tiempo = 12
        trabajador.cargo = "Gerente"
        trabajador.area = "Contabilidad"
        trabajador.Resultados()

        println("Dado con valor asignado:")
        var dado = Dado()
        dado.valor = 3
        dado.LanzarDado()

        println("Dado aleatorio:")
        var dadoale = Dado()
        dadoale.LanzarDado()
    }

    fun Trabajador(nombre:String, pagohora:Double, horas:Int, horaex: Int){
        println("El Nombre del trabajador es: $nombre")
        var pagoho = (pagohora*horas)
        var pagohoraex = ((pagohora*2)*horaex)
        var pagototal = pagoho + pagohoraex
        println("El Pago Total seria: $pagototal, $pagoho por $horas horas laborales y $pagohoraex por $horaex horas extras")
    }

    fun Tab(Tabla:Int, Limite:Int? = null){
        var Fin = 10
        if (Limite != null) {
            Fin = Limite
        }
        for (numero in 1..Fin) {
            var resultado = numero*Tabla
            println("$Tabla X $numero = $resultado")
        }
    }



}