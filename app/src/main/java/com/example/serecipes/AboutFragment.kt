package com.example.serecipes

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_about.view.*
import kotlinx.android.synthetic.main.fragment_about.view.backButton
import kotlinx.android.synthetic.main.fragment_browser.view.*
import kotlinx.android.synthetic.main.fragment_menu.view.*

class AboutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        view.backButton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_menuFragment)}

        val sharedPreferences = activity?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedBoolean = sharedPreferences?.getBoolean("BOOLEAN_KEY", false)
        if(savedBoolean!!){
            view.backButton.setBackgroundColor(Color.RED)
        }else{
            view.backButton.setBackgroundColor(Color.parseColor("#E395FF"))
        }

        return view
    }
}