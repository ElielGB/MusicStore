package com.example.musicstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val btnIniciar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {

            val editNombre = editNombre.getText().toString()
            val editApellidoP = editApellidoP.getText().toString()
            val editApellidoM = editApellidoM.getText().toString()
            val editEdad = editEdad.getText().toString()
            val editSexo = editSexo.getText().toString()
            val editCorreoE = editCorreoE.getText().toString()
            val editPass = editPass.getText().toString()
            val editPass2 = editPass2.getText().toString()




            if(editNombre.isEmpty()){
                Toast.makeText(this,"Debe ingresar su nombre", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editApellidoP.isEmpty()){
                Toast.makeText(this,"Debe ingresar su apellido paterno", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editApellidoM.isEmpty()){
                Toast.makeText(this,"Debe ingresar su apellido materno", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editEdad.isEmpty()){
                Toast.makeText(this,"Debe ingresar su edad", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editSexo.isEmpty()){
                Toast.makeText(this,"Debe ingresar su sexo", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editCorreoE.isEmpty()){
                Toast.makeText(this,"Debe definir su correo electrónico", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editPass.isEmpty()){
                Toast.makeText(this,"Debe definir su contraseña", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editPass2.isEmpty()){
                Toast.makeText(this,"Debe confirmar la contraseña definida", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            startActivity(Intent(this, Entrada::class.java))
            finish();

        }


    }
}