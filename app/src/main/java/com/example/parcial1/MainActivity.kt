package com.example.parcial1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recView: RecyclerView
    private lateinit var adapter: AdapterMain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recView = findViewById(R.id.Rec_Recetas)
        recView.layoutManager = LinearLayoutManager(this)
        val dataSet = getListadoRecetas()
        adapter = AdapterMain(applicationContext)
        recView.adapter = adapter
        adapter.submitList(dataSet)
        adapter.onItemClickListener = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nombre", it.nombre)
            intent.putExtra("imagen", it.imagen)
            intent.putExtra("continente", it.continente)
            intent.putExtra("ingredientes", it.ingredientes)
            intent.putExtra("preparacion", it.modoDePreparacion)
            startActivity(intent)
        }
    }
    private fun getListadoRecetas(): MutableList<Receta>? {
        return mutableListOf(
            Receta(
                1,
                "Pastel De Papa",
                "https://images.getrecipekit.com/20220629164540-pastel-de-papas.jpg?aspect_ratio=4:3&quality=90&https://images.getrecipekit.com/20220629164540-pastel-de-papas.jpg?aspect_ratio=4:3&quality=90&",
                arrayOf("Papas (aproximadamente 1.5 kg)", "1 cucharada de mantequilla", "1/2 taza de leche", "Sal y pimienta al gusto", ),
                "Pelar las papas y cortarlas en trozos pequeños.\n" +
                        "Cocinar las papas en agua hirviendo con sal hasta que estén suaves.\n" +
                        "Escurrir las papas y colocarlas en un tazón grande.\n" +
                        "Agregar la mantequilla y la leche caliente a las papas.\n" +
                        "Machacar las papas hasta obtener un puré suave y cremoso. Si deseas, puedes agregar un huevo a esta mezcla para mayor consistencia.\n" +
                        "Condimentar el puré de papas con sal y pimienta al gusto.\n" +
                        "Precalentar el horno a 180°C.\n" +
                        "Engrasar ligeramente un molde para hornear.\n" +
                        "Extender la mitad del puré de papas en el fondo del molde.\n" +
                        "Opcional: agregar una capa de queso rallado sobre el puré de papas.\n" +
                        "Colocar el resto del puré de papas sobre la capa de queso (si se agregó).\n" +
                        "Opcional: espolvorear más queso rallado sobre la capa superior de puré de papas.\n" +
                        "Hornear durante unos 25-30 minutos, o hasta que el pastel esté dorado y burbujeante en los bordes.\n" +
                        "Dejar enfriar un poco antes de cortar y servir.",
                Continente.AMERICA
                ),
            Receta(
                1,
                "Pastel De Papa",
                "https://images.getrecipekit.com/20220629164540-pastel-de-papas.jpg?aspect_ratio=4:3&quality=90&https://images.getrecipekit.com/20220629164540-pastel-de-papas.jpg?aspect_ratio=4:3&quality=90&",
                arrayOf("Papas (aproximadamente 1.5 kg)", "1 cucharada de mantequilla", "1/2 taza de leche", "Sal y pimienta al gusto", ),
                "Pelar las papas y cortarlas en trozos pequeños.\n" +
                        "Cocinar las papas en agua hirviendo con sal hasta que estén suaves.\n" +
                        "Escurrir las papas y colocarlas en un tazón grande.\n" +
                        "Agregar la mantequilla y la leche caliente a las papas.\n" +
                        "Machacar las papas hasta obtener un puré suave y cremoso. Si deseas, puedes agregar un huevo a esta mezcla para mayor consistencia.\n" +
                        "Condimentar el puré de papas con sal y pimienta al gusto.\n" +
                        "Precalentar el horno a 180°C.\n" +
                        "Engrasar ligeramente un molde para hornear.\n" +
                        "Extender la mitad del puré de papas en el fondo del molde.\n" +
                        "Opcional: agregar una capa de queso rallado sobre el puré de papas.\n" +
                        "Colocar el resto del puré de papas sobre la capa de queso (si se agregó).\n" +
                        "Opcional: espolvorear más queso rallado sobre la capa superior de puré de papas.\n" +
                        "Hornear durante unos 25-30 minutos, o hasta que el pastel esté dorado y burbujeante en los bordes.\n" +
                        "Dejar enfriar un poco antes de cortar y servir.",
                Continente.AMERICA
            ),
            Receta(
                1,
                "Pastel De Papa",
                "https://images.getrecipekit.com/20220629164540-pastel-de-papas.jpg?aspect_ratio=4:3&quality=90&https://images.getrecipekit.com/20220629164540-pastel-de-papas.jpg?aspect_ratio=4:3&quality=90&",
                arrayOf("Papas (aproximadamente 1.5 kg)", "1 cucharada de mantequilla", "1/2 taza de leche", "Sal y pimienta al gusto", ),
                "Pelar las papas y cortarlas en trozos pequeños.\n" +
                        "Cocinar las papas en agua hirviendo con sal hasta que estén suaves.\n" +
                        "Escurrir las papas y colocarlas en un tazón grande.\n" +
                        "Agregar la mantequilla y la leche caliente a las papas.\n" +
                        "Machacar las papas hasta obtener un puré suave y cremoso. Si deseas, puedes agregar un huevo a esta mezcla para mayor consistencia.\n" +
                        "Condimentar el puré de papas con sal y pimienta al gusto.\n" +
                        "Precalentar el horno a 180°C.\n" +
                        "Engrasar ligeramente un molde para hornear.\n" +
                        "Extender la mitad del puré de papas en el fondo del molde.\n" +
                        "Opcional: agregar una capa de queso rallado sobre el puré de papas.\n" +
                        "Colocar el resto del puré de papas sobre la capa de queso (si se agregó).\n" +
                        "Opcional: espolvorear más queso rallado sobre la capa superior de puré de papas.\n" +
                        "Hornear durante unos 25-30 minutos, o hasta que el pastel esté dorado y burbujeante en los bordes.\n" +
                        "Dejar enfriar un poco antes de cortar y servir.",
                Continente.AMERICA
            ),
        )
    }
}