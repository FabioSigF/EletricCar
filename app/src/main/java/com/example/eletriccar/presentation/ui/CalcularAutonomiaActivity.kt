package com.example.eletriccar.presentation.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccar.R

class CalcularAutonomiaActivity: AppCompatActivity() {
    lateinit var preco: EditText;
    lateinit var kmPercorrido: EditText;
    lateinit var resultado: TextView;
    lateinit var btnCalcular: Button;
    lateinit var btnBack: ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_autonomia);
        setupView()
        setupListeners()
    }
    fun setupView() {
        preco = findViewById(R.id.ed_preco);
        btnCalcular= findViewById(R.id.btn_form);
        kmPercorrido = findViewById(R.id.ed_km_percorrido);
        resultado = findViewById(R.id.tv_resultado);
        btnBack = findViewById(R.id.iv_back);
    }
    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular();
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
    fun calcular(){
        val precoDigitado = preco.text.toString().toFloat();
        val kmDigitado = kmPercorrido.text.toString().toFloat();
        val res = precoDigitado/kmDigitado;
        resultado.text = res.toString();
    }
}