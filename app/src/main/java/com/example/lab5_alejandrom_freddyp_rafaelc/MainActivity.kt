package com.example.lab5_alejandrom_freddyp_rafaelc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab5_alejandrom_freddyp_rafaelc.ui.theme.Lab5_AlejandroM_FreddyP_RafaelCTheme

class MainActivity : ComponentActivity() {
    private lateinit var ingresar: Button
    private lateinit var correo: EditText
    private lateinit var contra: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ingresar = findViewById(R.id.ingresar)
        correo = findViewById(R.id.correo)
        contra = findViewById(R.id.contrasena)
        ingresar.setOnClickListener {
            if(correo.text.toString().isEmpty()) {
                correo.error = "correo obligatorio"
            } else if (contra.text.toString().isEmpty()) {
                contra.error = "contraseña obligatoria"
            }
            else {
                if (correo.text.toString() == "ejemplo@email.com" && contra.text.toString() == "contra")  {
                    val intent = Intent(this,BienvenidaActivity::class.java)
                    startActivity(intent)
                } else {
                    println("ingrese el usuario y contraseña quemado")
                    Toast.makeText(this, "ingrese el usuario y contraseña quemado", Toast.LENGTH_SHORT).show()
                }
            }



        }
    }
}

