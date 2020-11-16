package com.example.projeto.restaurants

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto.R

class PratoDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato_details)

        val nome = intent.getStringExtra("NomePrato")
        val descricao = intent.getStringExtra("DescricaoPrato")
        val imagem = intent.getStringExtra("ImagemPrato")!!.toInt()
        val back = findViewById<ImageView>(R.id.imgBackPratoDetails)

        back.setOnClickListener() {
            onBackPressed()
        }

        val nomePrato = findViewById<TextView>(R.id.txtNomePratoDetails)
        nomePrato.text = nome
        val descricaoPrato = findViewById<TextView>(R.id.txtDescricaoPratoDetails)
        descricaoPrato.text = descricao
        val imagemPrato = findViewById<ImageView>(R.id.imgPratoDetails)
        imagemPrato.setImageResource(imagem)

    }
}