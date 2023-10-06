package com.example.eletriccar.presentation.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.eletriccar.presentation.ui.CarFragment
import com.example.eletriccar.presentation.ui.FavoriteFragment

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return CarFragment()
            1 -> return FavoriteFragment()
            else -> return CarFragment()
        }

    }
    override fun getItemCount(): Int = 2;

}