package com.example.musicstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_entrada.*

class Entrada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrada)

        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        val btnAccederRegistro = findViewById<Button>(R.id.btnAccederRegistro)

        btnIniciar.setOnClickListener {

            val editCorreo = editCorreo.getText().toString()
            val editContra = editContra.getText().toString()


            if(editCorreo.isEmpty()){
                Toast.makeText(this,"Debe ingresar su correo electrónico", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editContra.isEmpty()){
                Toast.makeText(this,"Debe ingresar su contraseña", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val bundle = Bundle()
            bundle.apply {
                putString("dato1",editCorreo)
                putString("dato2",editContra)

            }

            startActivity(Intent(this, Categorias::class.java))
            finish();

        }

        btnAccederRegistro.setOnClickListener {
            startActivity(Intent(this, Registro::class.java))
            finish();
        }
    }
}