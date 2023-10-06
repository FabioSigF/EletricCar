package com.example.eletriccar.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.eletriccar.R
import com.example.eletriccar.presentation.ui.adapter.CarAdapter
import com.example.eletriccar.presentation.data.CarFactory
import com.example.eletriccar.presentation.ui.adapter.TabsAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout;
    lateinit var viewPager: ViewPager2;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView();
        setupListeners();
        setupTabs();
    }
    
    fun setupView() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.vp_view_pager)
    }

    fun setupListeners() {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {//se tab nao for nulo...
                    viewPager.currentItem = it.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })
    }


    fun setupTabs(){
        val tabsAdapter = TabsAdapter(this);
        viewPager.adapter = tabsAdapter;
    }
}