package com.example.eletriccar.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.GridView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccar.R
import com.example.eletriccar.presentation.adapter.CarAdapter
import com.example.eletriccar.presentation.data.CarFactory

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular: Button;
    lateinit var lista: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView();
        setupListeners();
        setupList();
    }

    fun setupView() {
        btnCalcular= findViewById(R.id.btn_card_button_calcular);
        lista = findViewById(R.id.rv_lista_carros);
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }

    fun setupList() {
        val adapter = CarAdapter(CarFactory.list);
        lista.adapter = adapter;
    }
}