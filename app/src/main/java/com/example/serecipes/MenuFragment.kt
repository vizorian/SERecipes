package com.example.serecipes

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_menu.view.*
import kotlinx.android.synthetic.main.fragment_settings.view.*

class MenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val sharedPreferences = activity?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedBoolean = sharedPreferences?.getBoolean("BOOLEAN_KEY", false)
        if(savedBoolean!!){
            view.settingsButton.setBackgroundColor(Color.RED)
            view.aboutButton.setBackgroundColor(Color.RED)
            view.browserButton.setBackgroundColor(Color.RED)
        }else{
            view.settingsButton.setBackgroundColor(Color.parseColor("#E395FF"))
            view.aboutButton.setBackgroundColor(Color.parseColor("#E395FF"))
            view.browserButton.setBackgroundColor(Color.parseColor("#E395FF"))
        }

        view.browserButton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_browserFragment)}
        view.settingsButton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_settingsFragment)}
        view.aboutButton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_aboutFragment)}

        return view
    }
}