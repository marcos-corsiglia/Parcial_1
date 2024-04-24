package com.example.parcial1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterMain(val context: Context) : ListAdapter<Receta, AdapterMain.ViewHolder>(DiffCallBack) {
    lateinit var onItemClickListener: (Receta) -> Unit

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imagenElem: ImageView = view.findViewById(R.id.item_imagen)
        val nombreElem: TextView = view.findViewById(R.id.item_nombre)
        val continenteElem: ImageView = view.findViewById(R.id.item_continente)
        // Debere poner todos los atributos de Receta ??? /////////////////////////////////////////////////////////////////////////////////////////

        fun bind (receta: Receta) {
            nombreElem.text = receta.nombre

            Glide.with(context).load(receta.imagen).into(imagenElem)

            val image = when(receta.continente) {
                Continente.AMERICA -> R.drawable.america
                Continente.AFRICA -> R.drawable.africa
                Continente.EUROPA -> R.drawable.europa
                Continente.ASIA -> R.drawable.asia
                else -> R.drawable.oceania
            }

            continenteElem.setImageResource(image)

            view.setOnClickListener() {
                onItemClickListener(receta)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMain.ViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterMain.ViewHolder, position: Int) {
        val receta = getItem(position)
        holder.bind(receta)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Receta>() {
        override fun areItemsTheSame(oldItem: Receta, newItem: Receta): Boolean {
            return  oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Receta, newItem: Receta): Boolean {
            return oldItem == newItem
        }
    }
}