import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial1.R
import com.example.parcial1.Receta

class AdapterIngredientes(private val listaRecetas: List<Receta>) :
    RecyclerView.Adapter<AdapterIngredientes.IngredienteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredienteViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.detail_item, parent, false)
        return IngredienteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: IngredienteViewHolder, position: Int) {
        val ingredientes = listaRecetas[position].ingredientes
        holder.bindIngredientes(ingredientes)
    }

    override fun getItemCount(): Int {
        return listaRecetas.size
    }

    inner class IngredienteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewIngrediente: TextView =
            itemView.findViewById(R.id.dtl_rvIngredientes)

        fun bindIngredientes(ingredientes: Array<String>) {
            val textoIngredientes = ingredientes.joinToString(", ")
            textViewIngrediente.text = textoIngredientes
        }
    }
}
