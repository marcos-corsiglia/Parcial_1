package com.example.parcial1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recView: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recView = findViewById(R.id.Rec_Recetas)
        recView.layoutManager = LinearLayoutManager(this)
        val dataSet = getListadoRecetas()
        adapter = Adapter(applicationContext)
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
                "Papas (aproximadamente 1.5 kg).\n" +
                        "1 cucharada de mantequilla .\n" +
                        "1/2 taza de leche.\n" +
                        "Sal y pimienta al gusto",
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
                2,
                "Sushi",
                "https://cdn.britannica.com/52/128652-050-14AD19CA/Maki-zushi.jpg",
                "2 tazas de arroz de sushi\n" +
                        "2 1/2 tazas de agua\n" +
                        "1/2 taza de vinagre de arroz\n" +
                        "2 cucharadas de azúcar\n" +
                        "1 cucharadita de sal\n" +
                        "Nori (hojas de alga marina)\n" +
                        "Relleno opcional: pescado fresco (salmón, atún, etc.), aguacate, pepino, zanahoria rallada, queso crema, etc.\n" +
                        "Wasabi (opcional)\n" +
                        "Salsa de soja para acompañar",
                "Lavar el arroz de sushi en un colador bajo agua fría hasta que el agua salga clara.\n" +
                        "Colocar el arroz en una olla con 2 1/2 tazas de agua y llevar a ebullición. Luego, reducir el fuego a bajo y cocinar tapado durante unos 20 minutos, o hasta que el arroz esté tierno y el agua se haya absorbido por completo.\n" +
                        "Mientras el arroz se cocina, mezclar el vinagre de arroz, el azúcar y la sal en una pequeña olla a fuego medio-bajo hasta que el azúcar y la sal se disuelvan por completo. Dejar enfriar esta mezcla.\n" +
                        "Una vez que el arroz esté cocido, extenderlo en una bandeja grande y poco profunda para que se enfríe. Usar un abanico o una toalla para ventilar el arroz mientras se enfría.\n" +
                        "Una vez que el arroz esté a temperatura ambiente, agregar la mezcla de vinagre de arroz y mezclar suavemente hasta que esté bien distribuido.\n" +
                        "Colocar una hoja de nori sobre una esterilla de bambú para sushi con el lado brillante hacia abajo.\n" +
                        "Humedecer ligeramente las manos con agua para evitar que el arroz se pegue y extender una capa delgada y uniforme de arroz sobre la mitad de la hoja de nori, dejando un borde de aproximadamente 1 cm sin cubrir.\n" +
                        "Colocar el relleno deseado en el centro del arroz.\n" +
                        "Enrollar el sushi firmemente con la ayuda de la esterilla, asegurándose de presionar ligeramente para sellar el rollo.\n" +
                        "Cortar el rollo en rodajas usando un cuchillo afilado y limpio. Humedecer el cuchillo con agua entre cortes para obtener cortes limpios.\n" +
                        "Repetir el proceso con el resto de los ingredientes.\n" +
                        "Servir el sushi con salsa de soja y wasabi al gusto.",
                Continente.ASIA
            ),
            Receta(
                3,
                "Pescado y Papas",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Fish_and_chips_blackpool.jpg/800px-Fish_and_chips_blackpool.jpg",
                "Filetes de pescado (por ejemplo, tilapia, merluza, salmón) - 4 filetes\n" +
                        "Papas - 4 medianas, peladas y cortadas en rodajas\n" +
                        "Aceite de oliva - 4 cucharadas\n" +
                        "Ajo - 2 dientes, picados\n" +
                        "Perejil fresco - 2 cucharadas, picado\n" +
                        "Sal - al gusto\n" +
                        "Pimienta negra - al gusto\n" +
                        "Jugo de limón - 2 cucharadas\n" +
                        "Rodajas de limón (opcional, para decorar)\n" +
                        "Papel de aluminio",
                "Precalienta el horno a 200°C (390°F).\n" +
                        "En un tazón pequeño, mezcla el aceite de oliva, el ajo picado, el perejil picado, el jugo de limón, la sal y la pimienta. Reserva.\n" +
                        "Coloca las rodajas de papa en una bandeja para hornear cubierta con papel de aluminio. Vierte la mitad de la mezcla de aceite de oliva sobre las papas y revuelve para cubrirlas uniformemente.\n" +
                        "Hornea las papas en el horno precalentado durante unos 20 minutos o hasta que estén tiernas.\n" +
                        "Mientras las papas se hornean, coloca los filetes de pescado en otra bandeja para hornear cubierta con papel de aluminio. Salpimienta los filetes al gusto.\n" +
                        "Una vez que las papas estén medio cocidas, retira la bandeja del horno y coloca los filetes de pescado al lado de las papas.\n" +
                        "Vierte el resto de la mezcla de aceite de oliva sobre los filetes de pescado.\n" +
                        "Vuelve a colocar la bandeja en el horno y continúa horneando durante unos 15-20 minutos más, o hasta que el pescado esté cocido y las papas estén doradas y tiernas.\n" +
                        "Retira del horno y deja reposar unos minutos antes de servir.\n" +
                        "Opcional: decora con rodajas de limón antes de servir.",
                Continente.EUROPA
            ),
            Receta(
                4,
                "Paella Española",
                "https://panamei.com/wp-content/uploads/2018/04/28870096_1822768124465316_6637298469105960784_n.jpg",
                "Arroz - 2 tazas\n" +
                        "Pollo - 2 pechugas, cortadas en trozos\n" +
                        "Chorizo español - 200 g, en rodajas\n" +
                        "Langostinos - 8 unidades, pelados\n" +
                        "Calamares - 200 g, limpios y cortados en anillos\n" +
                        "Pimiento rojo - 1, cortado en tiras\n" +
                        "Pimiento verde - 1, cortado en tiras\n" +
                        "Cebolla - 1 grande, picada\n" +
                        "Ajo - 3 dientes, picados\n" +
                        "Tomate - 2 medianos, rallados\n" +
                        "Caldo de pollo - 4 tazas\n" +
                        "Azafrán - 1 pizca\n" +
                        "Aceite de oliva - 4 cucharadas\n" +
                        "Sal - al gusto\n" +
                        "Pimienta - al gusto\n" +
                        "Limón - para servir\n" +
                        "Perejil fresco - para decorar",
                "En una paellera grande o sartén honda, calienta el aceite de oliva a fuego medio-alto.\n" +
                        "Agrega el pollo y el chorizo, y cocínalos hasta que estén dorados por todos lados. Retíralos de la paellera y reserva.\n" +
                        "En la misma paellera, agrega un poco más de aceite si es necesario y saltea los langostinos y los calamares hasta que estén cocidos. Retíralos y reserva.\n" +
                        "En la misma paellera, agrega un poco más de aceite si es necesario y saltea la cebolla, los pimientos y el ajo hasta que estén tiernos.\n" +
                        "Añade el tomate rallado y cocina por unos minutos hasta que se forme una salsa espesa.\n" +
                        "Agrega el arroz y mezcla bien para que se impregne con la salsa.\n" +
                        "Incorpora el caldo de pollo caliente y el azafrán. Condimenta con sal y pimienta al gusto.\n" +
                        "Coloca el pollo y el chorizo reservados sobre el arroz en la paellera.\n" +
                        "Cocina a fuego medio durante unos 15-20 minutos o hasta que el arroz esté tierno y haya absorbido todo el líquido, removiendo ocasionalmente.\n" +
                        "Cuando falten unos minutos para terminar la cocción, coloca los langostinos y los calamares reservados sobre el arroz para que se calienten.\n" +
                        "Retira del fuego y deja reposar la paella durante unos minutos antes de servir.\n" +
                        "Sirve caliente con rodajas de limón y espolvorea con perejil fresco picado para decorar.",
                Continente.EUROPA
            ),
            Receta(
                5,
                "Ratatouille",
                "https://www.allrecipes.com/thmb/F1rucOY3FQT5Ic0oyxdLoqU_yKc=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/222006-disneys-ratatouille-DDMFS-4x3-36eb15843ab548a79e7aab761dac92e1.jpg",
                "Berengenas - 2 medianas, cortadas en rodajas\n" +
                        "Calabacín - 2 medianos, cortados en rodajas\n" +
                        "Pimientos rojos - 2 medianos, cortados en tiras\n" +
                        "Tomates - 4 medianos, cortados en rodajas\n" +
                        "Cebolla - 1 grande, cortada en rodajas\n" +
                        "Ajo - 4 dientes, picados\n" +
                        "Tomate triturado - 1 lata (400 g)\n" +
                        "Aceite de oliva - 4 cucharadas\n" +
                        "Tomillo fresco - 2 cucharaditas, picado\n" +
                        "Albahaca fresca - 2 cucharaditas, picada\n" +
                        "Sal - al gusto\n" +
                        "Pimienta - al gusto",
                "Precalienta el horno a 180°C (350°F).\n" +
                        "En una sartén grande, calienta 2 cucharadas de aceite de oliva a fuego medio. Saltea la cebolla y el ajo hasta que estén tiernos.\n" +
                        "Agrega el tomate triturado a la sartén y cocina por unos minutos más. Condimenta con sal, pimienta, tomillo y albahaca al gusto.\n" +
                        "Vierte la mezcla de tomate en el fondo de una fuente para horno.\n" +
                        "Coloca las rodajas de berenjena, calabacín, pimientos y tomates alternadamente sobre la mezcla de tomate en la fuente para horno, formando filas superpuestas.\n" +
                        "Rocía las verduras con las 2 cucharadas restantes de aceite de oliva y condimenta con sal, pimienta, tomillo y albahaca al gusto.\n" +
                        "Cubre la fuente para horno con papel de aluminio y hornea durante 45-50 minutos o hasta que las verduras estén tiernas.\n" +
                        "Retira el papel de aluminio y hornea por otros 10-15 minutos o hasta que las verduras estén ligeramente doradas.\n" +
                        "Sirve caliente como plato principal o como guarnición. ¡Disfruta tu ratatouille!",
                Continente.EUROPA
            ),
            Receta(
                6,
                "Pavlova",
                "https://resizer.glanacion.com/resizer/v2/pavlova-facil-de-I657NPJDTNFHBDZVSASFZ3L4RI.jpg?auth=873bb456322669c6eeee56e1f34c5e15b3156976b40fef03c5c9847fce2c4f30&width=768&height=512&quality=70&smart=true",
                "Claras de huevo - 4 grandes\n" +
                        "Azúcar - 1 taza\n" +
                        "Vinagre de vino blanco - 1 cucharadita\n" +
                        "Maicena - 1 cucharadita\n" +
                        "Extracto de vainilla - 1 cucharadita\n" +
                        "Crema batida - para cubrir\n" +
                        "Frutas frescas (fresas, kiwi, mango, etc.) - para decorar",
                "Precalienta el horno a 150°C (300°F) y forra una bandeja para hornear con papel pergamino.\n" +
                        "En un tazón grande, bate las claras de huevo con una batidora eléctrica a velocidad alta hasta que se formen picos suaves.\n" +
                        "Agrega gradualmente el azúcar, una cucharada a la vez, batiendo bien después de cada adición, hasta que el merengue esté brillante y firme.\n" +
                        "Agrega el vinagre, la maicena y el extracto de vainilla al merengue y mezcla suavemente con una espátula.\n" +
                        "Vierte el merengue en la bandeja para hornear preparada y forma un círculo con un borde ligeramente elevado.\n" +
                        "Hornea durante 1 hora y 15 minutos o hasta que el exterior esté crujiente y seco.\n" +
                        "Apaga el horno y deja enfriar la pavlova completamente dentro del horno con la puerta entreabierta.\n" +
                        "Cuando esté completamente fría, cubre la pavlova con crema batida y decora con frutas frescas.\n" +
                        "Sirve inmediatamente y disfruta de este delicioso postre de Oceanía.",
                Continente.OCEANIA
            ),
            Receta(
                7,
                "Pad Thai",
                "https://www.recipetineats.com/wp-content/uploads/2020/01/Chicken-Pad-Thai_9-SQ.jpg",
                "Fideos de arroz - 200 g\n" +
                        "Camarones - 200 g, pelados y desvenados\n" +
                        "Tofu firme - 200 g, cortado en cubos\n" +
                        "Brotes de soja - 1 taza\n" +
                        "Cebolla verde - 2, cortadas en trozos pequeños\n" +
                        "Cacahuetes - 1/4 taza, picados\n" +
                        "Huevos - 2\n" +
                        "Aceite de cocina - 3 cucharadas\n" +
                        "Ajo - 3 dientes, picados\n" +
                        "Salsa de tamarindo - 3 cucharadas\n" +
                        "Azúcar - 2 cucharadas\n" +
                        "Salsa de pescado - 2 cucharadas\n" +
                        "Vinagre de arroz - 1 cucharada\n" +
                        "Chile en polvo - 1 cucharadita (opcional)\n" +
                        "Limón - para servir\n" +
                        "Cilantro fresco - para decorar",
                "Cocina los fideos de arroz según las instrucciones del paquete. Escúrrelos y enjuágalos con agua fría. Reserva.\n" +
                        "En una sartén grande o wok, calienta 1 cucharada de aceite a fuego medio-alto. Agrega el tofu y cocínalo hasta que esté dorado por todos lados. Retíralo de la sartén y reserva.\n" +
                        "En la misma sartén, agrega 1 cucharada de aceite y saltea el ajo picado hasta que esté fragante.\n" +
                        "Agrega los camarones y cocínalos hasta que estén rosados y cocidos. Retíralos de la sartén y reserva.\n" +
                        "En la misma sartén, agrega el huevo batido y revuélvelo hasta que esté cocido y en trozos pequeños. Retíralo de la sartén y reserva.\n" +
                        "En la misma sartén, agrega el fideo de arroz cocido, los brotes de soja, la cebolla verde y los cacahuetes picados. Revuelve bien.\n" +
                        "En un tazón pequeño, mezcla la salsa de tamarindo, el azúcar, la salsa de pescado, el vinagre de arroz y el chile en polvo (si lo estás usando).\n" +
                        "Vierte la mezcla de salsa sobre los fideos en la sartén y mezcla bien para que se distribuya uniformemente.\n" +
                        "Agrega los camarones, el tofu y los huevos revueltos a la sartén y revuelve suavemente para combinar todos los ingredientes.\n" +
                        "Sirve caliente con rodajas de limón y cilantro fresco para decorar. ¡Disfruta de tu delicioso Pad Thai!",
                Continente.ASIA
            )

        )
    }
}