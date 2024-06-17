package com.example.lab5_alejandrom_freddyp_rafaelc

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class BienvenidaActivity : ComponentActivity(){
    private lateinit var menu: Button
    private lateinit var salir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        menu = findViewById(R.id.menu)
        salir = findViewById(R.id.salir)
        registerForContextMenu(menu)

        salir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_bienvenida, menu)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.crearUsuariomenu -> {
                val intent = Intent(this, CrearUsuarioActivity::class.java)
                startActivity(intent)
                true
            }

            else -> super.onContextItemSelected(item)
        }
    }

}