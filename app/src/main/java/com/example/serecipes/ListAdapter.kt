package com.example.serecipes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.serecipes.data.Recipe
import android.content.Context
import android.content.res.Resources
import kotlinx.android.synthetic.main.custom_row.view.*
import kotlinx.android.synthetic.main.fragment_recipe.view.*


class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var recipeList = emptyList<Recipe>();

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = recipeList[position]
        holder.itemView.name_txt.text = currentItem.name
        when (currentItem.id) {
            1 -> { holder.itemView.iv_image.setImageResource(R.drawable.img1) }
            2 -> { holder.itemView.iv_image.setImageResource(R.drawable.img2) }
            3 -> { holder.itemView.iv_image.setImageResource(R.drawable.img3) }
            4 -> { holder.itemView.iv_image.setImageResource(R.drawable.img4) }
            5 -> { holder.itemView.iv_image.setImageResource(R.drawable.img5) }
            6 -> { holder.itemView.iv_image.setImageResource(R.drawable.img6) }
            7 -> { holder.itemView.iv_image.setImageResource(R.drawable.img7) }
            8 -> { holder.itemView.iv_image.setImageResource(R.drawable.img8) }
            9 -> { holder.itemView.iv_image.setImageResource(R.drawable.img9) }
            10 -> { holder.itemView.iv_image.setImageResource(R.drawable.img10) }
            11 -> { holder.itemView.iv_image.setImageResource(R.drawable.img11) }
            12 -> { holder.itemView.iv_image.setImageResource(R.drawable.img12) }
            13 -> { holder.itemView.iv_image.setImageResource(R.drawable.img13) }
            14 -> { holder.itemView.iv_image.setImageResource(R.drawable.img14) }
            15 -> { holder.itemView.iv_image.setImageResource(R.drawable.img15) }
            16 -> { holder.itemView.iv_image.setImageResource(R.drawable.img16) }
            17 -> { holder.itemView.iv_image.setImageResource(R.drawable.img17) }
            18 -> { holder.itemView.iv_image.setImageResource(R.drawable.img18) }
            19 -> { holder.itemView.iv_image.setImageResource(R.drawable.img19) }
            20 -> { holder.itemView.iv_image.setImageResource(R.drawable.img20) }
            21 -> { holder.itemView.iv_image.setImageResource(R.drawable.img21) }
        }

        holder.itemView.rowLayout.setOnClickListener{
            val action = BrowserFragmentDirections.actionBrowserFragmentToRecipeFragment(currentItem)
            holder.itemView.findNavController().navigate(action)
        }
    }

    fun Context.resIdByName(resIdName: String?, resType: String): Int {
        resIdName?.let {
            return resources.getIdentifier(it, resType, packageName)
        }
        throw Resources.NotFoundException()
    }

    fun setData(recipe: List<Recipe>){
        this.recipeList = recipe
        notifyDataSetChanged()
    }
}