package com.example.lab5_alejandrom_freddyp_rafaelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class CrearUsuarioActivity: ComponentActivity() {
    private lateinit var nombre: EditText
    private lateinit var contra: EditText
    private lateinit var cedula: EditText
    private lateinit var correo: EditText
    private lateinit var crearBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)
        nombre = findViewById(R.id.nombre)
        contra = findViewById(R.id.contra)
        cedula = findViewById(R.id.ced)
        correo = findViewById(R.id.email)
        crearBtn = findViewById(R.id.crearUser)
        crearBtn.setOnClickListener {
            when {
                nombre.text.toString().isEmpty() -> {
                    nombre.error = "nombre es obligatorio"
                }
                contra.text.toString().isEmpty() -> {
                contra.error = "contraseña es obligatoria"
                }
                cedula.text.toString().isEmpty() -> {
                    cedula.error = "cedula es obligatoria"
                }
                correo.text.toString().isEmpty() -> {
                    correo.error = "correo es obligatorio"
                }
                else -> {
                    Toast.makeText(this, "se creo el usuario", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, BienvenidaActivity::class.java)
                    startActivity(intent)
                }
                }
            }

    }

}