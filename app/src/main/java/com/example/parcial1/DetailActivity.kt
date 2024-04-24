package com.example.parcial1

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    lateinit var txtNombre: TextView
    lateinit var imgImagen: ImageView
    lateinit var rvIngredientes: RecyclerView
    lateinit var imgContinente: ImageView
    lateinit var txtPreparacion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.detail_item)

        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val imagen = bundle?.getString("imagen")
        val ingredientes = bundle?.getString("ingredientes")
        val continente = bundle?.getString("continente")
        val preparacion = bundle?.getString("preparacion")

        txtNombre = findViewById(R.id.dtl_Nombre)
        imgImagen = findViewById(R.id.dtl_imagen)
        rvIngredientes = findViewById(R.id.dtl_rvIngredientes)
        imgContinente = findViewById(R.id.dtl_continente)
        txtPreparacion = findViewById(R.id.dtl_preparacion)

        txtNombre.text = nombre
        txtPreparacion.text = preparacion

        Glide.with(applicationContext).load(imagen).into(imgImagen)

        // ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        val continenteImageResourceId = resources.getIdentifier(continente, "drawable", packageName)
        imgContinente.setImageResource(continenteImageResourceId)
    }
}