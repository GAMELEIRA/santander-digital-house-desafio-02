package com.example.projeto.restaurants.model

data class Restaurant(val nome: String, val endereco: String, val horarioFechamento: String, val imagem: Int,val pratos: List<Prato>)