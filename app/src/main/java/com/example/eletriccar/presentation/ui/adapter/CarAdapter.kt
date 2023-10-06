package com.example.eletriccar.presentation.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccar.R
import com.example.eletriccar.presentation.domain.Carro

class CarAdapter(private val carros: List<Carro>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false);
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.marca.text = carros[position].marca;
        holder.modelo.text = carros[position].modelo;
        holder.preco.text = carros[position].preco;
        holder.bateria.text = carros[position].bateria;
        holder.potencia.text = carros[position].potencia;
        holder.recarga.text = carros[position].recarga;
    }

    override fun getItemCount(): Int = carros.size;

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val marca: TextView;
        val modelo: TextView;
        val preco: TextView;
        val bateria: TextView;
        val potencia: TextView;
        val recarga: TextView;

        init {
            marca = view.findViewById(R.id.tv_value_marca)
            modelo= view.findViewById(R.id.tv_value_modelo)
            preco= view.findViewById(R.id.tv_value_preco)
            bateria= view.findViewById(R.id.tv_value_bateria)
            potencia= view.findViewById(R.id.tv_value_potencia)
            recarga= view.findViewById(R.id.tv_value_recarga)
        }
    }
}

