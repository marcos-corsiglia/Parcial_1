package com.example.parcial1

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class DetailActivity : AppCompatActivity() {
    lateinit var txtNombre: TextView
    lateinit var imgImagen: ImageView
    lateinit var txtIngredientes: TextView
    lateinit var txtPreparacion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.detail_item)

        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val imagen = bundle?.getString("imagen")
        val ingredientes = bundle?.getString("ingredientes")
        val preparacion = bundle?.getString("preparacion")

        txtNombre = findViewById(R.id.dtl_Nombre)
        imgImagen = findViewById(R.id.dtl_imagen)
        txtIngredientes = findViewById(R.id.dtl_ingredientes)
        txtPreparacion = findViewById(R.id.dtl_preparacion)

        txtNombre.text = nombre
        txtIngredientes.text = ingredientes
        txtPreparacion.text = preparacion

        Glide.with(applicationContext).load(imagen).into(imgImagen)

        txtIngredientes.setMovementMethod(ScrollingMovementMethod())
        txtPreparacion.setMovementMethod(ScrollingMovementMethod())
    }
}