package com.example.serecipes

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import android.content.SharedPreferences
import android.graphics.Color
import android.util.Log
import kotlinx.android.synthetic.main.fragment_about.view.*
import kotlinx.android.synthetic.main.fragment_about.view.backButton
import kotlinx.android.synthetic.main.fragment_browser.*
import kotlinx.android.synthetic.main.fragment_browser.view.*
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.fragment_settings.view.*

class SettingsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        view.backButton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_menuFragment)}

        val sharedPreferences = activity?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedBoolean = sharedPreferences?.getBoolean("BOOLEAN_KEY", false)

        if (savedBoolean!!) {
            view.sv_redMode.isChecked = savedBoolean
            view.backButton.setBackgroundColor(Color.RED)
        }else{
            view.sv_redMode.isChecked = false
            view.backButton.setBackgroundColor(Color.parseColor("#E395FF"))
        }

        view.sv_redMode.setOnClickListener{
            saveData()
            if(view.sv_redMode.isChecked){
                view.backButton.setBackgroundColor(Color.RED)
            }else{
                view.backButton.setBackgroundColor(Color.parseColor("#E395FF"))
            }
        }

        return view
    }

    private fun saveData(){
        val sharedPreferences = activity?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()
        editor?.apply {
            putBoolean("BOOLEAN_KEY", sv_redMode.isChecked)
        }?.apply()
    }
}