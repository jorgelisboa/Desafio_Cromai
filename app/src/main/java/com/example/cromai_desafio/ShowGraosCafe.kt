package com.example.cromai_desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

lateinit var cafes : Array<String>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cafes = arrayOf("Café Arábica", "Café Bourbon", "Café Kona", "Café Catuaí", "Café Acaiá", "Café Robusta", "Café Geisha")
    }

    fun changeScreen(view: View) {
        val intent = Intent(this, TiposGraosCafe::class.java)
            intent.putExtra("cafeArray", cafes)
        startActivity(intent)
        finish()
    }
}