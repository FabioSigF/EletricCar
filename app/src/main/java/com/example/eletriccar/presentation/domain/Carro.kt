package com.example.eletriccar.presentation.domain

data class Carro(
    val id: Int,
    val marca: String,
    val modelo: String,
    val preco: String,
    val bateria: String,
    val potencia: String,
    val recarga: String,
    val urlPhoto: String
);