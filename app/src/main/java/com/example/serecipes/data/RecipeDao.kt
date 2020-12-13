package com.example.serecipes.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe_table ORDER BY id ASC")
    fun readAllData() : LiveData<List<Recipe>>
}