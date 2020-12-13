package com.example.serecipes

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.serecipes.data.Recipe
import com.example.serecipes.data.RecipeViewModel
import kotlinx.android.synthetic.main.custom_row.view.*
import kotlinx.android.synthetic.main.fragment_browser.view.*
import kotlinx.android.synthetic.main.fragment_browser.view.backButton
import kotlinx.android.synthetic.main.fragment_recipe.view.*

class RecipeFragment : Fragment() {
    private val args by navArgs<RecipeFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recipe, container, false)

        view.backButton.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_recipeFragment_to_browserFragment)}

        val sharedPreferences = activity?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedBoolean = sharedPreferences?.getBoolean("BOOLEAN_KEY", false)
        if(savedBoolean!!){
            view.backButton.setBackgroundColor(Color.RED)
        }else{
            view.backButton.setBackgroundColor(Color.parseColor("#E395FF"))
        }

        // Radios
        view.radio_one.setOnClickListener{
            val mult = 1f
            if(args.currentRecipe.cobaltCost != 0f){
                val value = args.currentRecipe.cobaltCost * mult
                view.cobaltCost_txt.text = value.toString()
            }
            if(args.currentRecipe.goldCost != 0f){
                val value = args.currentRecipe.goldCost * mult
                view.goldCost_txt.text = value.toString()
            }
            if(args.currentRecipe.ironCost != 0f){
                val value = args.currentRecipe.ironCost * mult
                view.ironCost_txt.text = value.toString()
            }
            if(args.currentRecipe.magnesiumCost != 0f){
                val value = args.currentRecipe.magnesiumCost * mult
                view.magnesiumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.nickelCost != 0f){
                val value = args.currentRecipe.nickelCost * mult
                view.nickelCost_txt.text = value.toString()
            }
            if(args.currentRecipe.platinumCost != 0f){
                val value = args.currentRecipe.platinumCost * mult
                view.platinumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.siliconCost != 0f){
                val value = args.currentRecipe.siliconCost * mult
                view.siliconCost_txt.text = value.toString()
            }
            if(args.currentRecipe.silverCost != 0f){
                val value = args.currentRecipe.silverCost * mult
                view.silverCost_txt.text = value.toString()
            }
            if(args.currentRecipe.gravelCost != 0f){
                val value = args.currentRecipe.gravelCost * mult
                view.gravelCost_txt.text = value.toString()
            }
        }

        view.radio_two.setOnClickListener{
            val mult = 10f
            if(args.currentRecipe.cobaltCost != 0f){
                val value = args.currentRecipe.cobaltCost * mult
                view.cobaltCost_txt.text = value.toString()
            }
            if(args.currentRecipe.goldCost != 0f){
                val value = args.currentRecipe.goldCost * mult
                view.goldCost_txt.text = value.toString()
            }
            if(args.currentRecipe.ironCost != 0f){
                val value = args.currentRecipe.ironCost * mult
                view.ironCost_txt.text = value.toString()
            }
            if(args.currentRecipe.magnesiumCost != 0f){
                val value = args.currentRecipe.magnesiumCost * mult
                view.magnesiumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.nickelCost != 0f){
                val value = args.currentRecipe.nickelCost * mult
                view.nickelCost_txt.text = value.toString()
            }
            if(args.currentRecipe.platinumCost != 0f){
                val value = args.currentRecipe.platinumCost * mult
                view.platinumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.siliconCost != 0f){
                val value = args.currentRecipe.siliconCost * mult
                view.siliconCost_txt.text = value.toString()
            }
            if(args.currentRecipe.silverCost != 0f){
                val value = args.currentRecipe.silverCost * mult
                view.silverCost_txt.text = value.toString()
            }
            if(args.currentRecipe.gravelCost != 0f){
                val value = args.currentRecipe.gravelCost * mult
                view.gravelCost_txt.text = value.toString()
            }
        }

        view.radio_three.setOnClickListener{
            val mult = 100f
            if(args.currentRecipe.cobaltCost != 0f){
                val value = args.currentRecipe.cobaltCost * mult
                view.cobaltCost_txt.text = value.toString()
            }
            if(args.currentRecipe.goldCost != 0f){
                val value = args.currentRecipe.goldCost * mult
                view.goldCost_txt.text = value.toString()
            }
            if(args.currentRecipe.ironCost != 0f){
                val value = args.currentRecipe.ironCost * mult
                view.ironCost_txt.text = value.toString()
            }
            if(args.currentRecipe.magnesiumCost != 0f){
                val value = args.currentRecipe.magnesiumCost * mult
                view.magnesiumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.nickelCost != 0f){
                val value = args.currentRecipe.nickelCost * mult
                view.nickelCost_txt.text = value.toString()
            }
            if(args.currentRecipe.platinumCost != 0f){
                val value = args.currentRecipe.platinumCost * mult
                view.platinumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.siliconCost != 0f){
                val value = args.currentRecipe.siliconCost * mult
                view.siliconCost_txt.text = value.toString()
            }
            if(args.currentRecipe.silverCost != 0f){
                val value = args.currentRecipe.silverCost * mult
                view.silverCost_txt.text = value.toString()
            }
            if(args.currentRecipe.gravelCost != 0f){
                val value = args.currentRecipe.gravelCost * mult
                view.gravelCost_txt.text = value.toString()
            }
        }

        view.radio_four.setOnClickListener{
            val mult = 1000f
            if(args.currentRecipe.cobaltCost != 0f){
                val value = args.currentRecipe.cobaltCost * mult
                view.cobaltCost_txt.text = value.toString()
            }
            if(args.currentRecipe.goldCost != 0f){
                val value = args.currentRecipe.goldCost * mult
                view.goldCost_txt.text = value.toString()
            }
            if(args.currentRecipe.ironCost != 0f){
                val value = args.currentRecipe.ironCost * mult
                view.ironCost_txt.text = value.toString()
            }
            if(args.currentRecipe.magnesiumCost != 0f){
                val value = args.currentRecipe.magnesiumCost * mult
                view.magnesiumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.nickelCost != 0f){
                val value = args.currentRecipe.nickelCost * mult
                view.nickelCost_txt.text = value.toString()
            }
            if(args.currentRecipe.platinumCost != 0f){
                val value = args.currentRecipe.platinumCost * mult
                view.platinumCost_txt.text = value.toString()
            }
            if(args.currentRecipe.siliconCost != 0f){
                val value = args.currentRecipe.siliconCost * mult
                view.siliconCost_txt.text = value.toString()
            }
            if(args.currentRecipe.silverCost != 0f){
                val value = args.currentRecipe.silverCost * mult
                view.silverCost_txt.text = value.toString()
            }
            if(args.currentRecipe.gravelCost != 0f){
                val value = args.currentRecipe.gravelCost * mult
                view.gravelCost_txt.text = value.toString()
            }
        }

        when (args.currentRecipe.id) {
            1 -> { view.item_img.setImageResource(R.drawable.img1) }
            2 -> { view.item_img.setImageResource(R.drawable.img2) }
            3 -> { view.item_img.setImageResource(R.drawable.img3) }
            4 -> { view.item_img.setImageResource(R.drawable.img4) }
            5 -> { view.item_img.setImageResource(R.drawable.img5) }
            6 -> { view.item_img.setImageResource(R.drawable.img6) }
            7 -> { view.item_img.setImageResource(R.drawable.img7) }
            8 -> { view.item_img.setImageResource(R.drawable.img8) }
            9 -> { view.item_img.setImageResource(R.drawable.img9) }
            10 -> { view.item_img.setImageResource(R.drawable.img10) }
            11 -> { view.item_img.setImageResource(R.drawable.img11) }
            12 -> { view.item_img.setImageResource(R.drawable.img12) }
            13 -> { view.item_img.setImageResource(R.drawable.img13) }
            14 -> { view.item_img.setImageResource(R.drawable.img14) }
            15 -> { view.item_img.setImageResource(R.drawable.img15) }
            16 -> { view.item_img.setImageResource(R.drawable.img16) }
            17 -> { view.item_img.setImageResource(R.drawable.img17) }
            18 -> { view.item_img.setImageResource(R.drawable.img18) }
            19 -> { view.item_img.setImageResource(R.drawable.img19) }
            20 -> { view.item_img.setImageResource(R.drawable.img20) }
            21 -> { view.item_img.setImageResource(R.drawable.img21) }
        }

        view.itemName_txt.text = args.currentRecipe.name

        if(args.currentRecipe.cobaltCost != 0f){
            view.cobaltRow.visibility = View.VISIBLE
            view.cobaltMat_txt.text = "Cobalt ingot"
            view.cobaltCost_txt.text = args.currentRecipe.cobaltCost.toString()
        }
        if(args.currentRecipe.goldCost != 0f){
            view.goldRow.visibility = View.VISIBLE
            view.goldMat_txt.text = "Gold ingot"
            view.goldCost_txt.text = args.currentRecipe.goldCost.toString()
        }
        if(args.currentRecipe.ironCost != 0f){
            view.ironRow.visibility = View.VISIBLE
            view.ironMat_txt.text = "Iron ingot"
            view.ironCost_txt.text = args.currentRecipe.ironCost.toString()
        }
        if(args.currentRecipe.magnesiumCost != 0f){
            view.magnesiumRow.visibility = View.VISIBLE
            view.magnesiumMat_txt.text = "Magnesium powder"
            view.magnesiumCost_txt.text = args.currentRecipe.magnesiumCost.toString()
        }
        if(args.currentRecipe.nickelCost != 0f){
            view.nickelRow.visibility = View.VISIBLE
            view.nickelMat_txt.text = "Nickel ingot"
            view.nickelCost_txt.text = args.currentRecipe.nickelCost.toString()
        }
        if(args.currentRecipe.platinumCost != 0f){
            view.platinumRow.visibility = View.VISIBLE
            view.platinumMat_txt.text = "Platinum ingot"
            view.platinumCost_txt.text = args.currentRecipe.platinumCost.toString()
        }
        if(args.currentRecipe.siliconCost != 0f){
            view.siliconRow.visibility = View.VISIBLE
            view.siliconMat_txt.text = "Silicon wafer"
            view.siliconCost_txt.text = args.currentRecipe.siliconCost.toString()
        }
        if(args.currentRecipe.silverCost != 0f){
            view.silverRow.visibility = View.VISIBLE
            view.silverMat_txt.text = "Silver ingot"
            view.silverCost_txt.text = args.currentRecipe.silverCost.toString()
        }
        if(args.currentRecipe.gravelCost != 0f){
            view.gravelRow.visibility = View.VISIBLE
            view.gravelMat_txt.text = "Gravel"
            view.gravelCost_txt.text = args.currentRecipe.gravelCost.toString()
        }

        return view
    }
}