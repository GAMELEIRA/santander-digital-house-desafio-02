package com.example.projeto.restaurants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto.R
import com.example.projeto.restaurants.data.Database
import com.example.projeto.restaurants.model.Restaurant

class RestaurantListActivity : AppCompatActivity() {

    private lateinit var viewManager: GridLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RestaurantListAdapter
    private lateinit var listaRestaurantes: List<Restaurant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_list)

        viewManager = GridLayoutManager(this, 1)
        listaRestaurantes = Database.restaurant

        recyclerView = findViewById(R.id.minhaLista)
        viewAdapter = RestaurantListAdapter(listaRestaurantes) {
            val intent = Intent(this, RestaurantDetailsActivity::class.java)
            intent.putExtra("Nome", it.nome)

            startActivity(intent)

        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }

    }


}