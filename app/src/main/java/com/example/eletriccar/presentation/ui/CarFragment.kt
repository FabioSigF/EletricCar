package com.example.eletriccar.presentation.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.eletriccar.R
import com.example.eletriccar.presentation.data.CarFactory
import com.example.eletriccar.presentation.ui.adapter.CarAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout

class CarFragment: Fragment() {
    lateinit var btnCalcular: FloatingActionButton;
    lateinit var lista: RecyclerView;
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view);
        setupListeners();
        setupList();
    }
    fun setupView(view: View) {
        view.apply {
            btnCalcular= findViewById(R.id.fab_calcular);
            lista = findViewById(R.id.rv_lista_carros);
        }
    }
    fun setupList() {
        val adapter = CarAdapter(CarFactory.list);
        lista.adapter = adapter;
    }
    fun setupListeners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(context, CalcularAutonomiaActivity::class.java))
        }
    }



}