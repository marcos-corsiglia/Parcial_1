package com.example.parcial1

data class Receta(
    val id: Int,
    val nombre: String,
    val imagen: String,
    val ingredientes: String,
    val modoDePreparacion: String,
    val continente: Continente
)

enum class Continente {
    AMERICA, AFRICA, EUROPA, ASIA, OCEANIA
}