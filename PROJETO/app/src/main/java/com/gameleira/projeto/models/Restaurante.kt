package com.gameleira.projeto.models

data class Restaurante (val nome: String, val endereco: String, val horarioFechamento: String, val imagem: Int,val pratos: List<Comida>)