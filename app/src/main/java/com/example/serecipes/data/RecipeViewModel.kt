package com.example.serecipes.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class RecipeViewModel(application: Application): AndroidViewModel(application) {
    val readAllData: LiveData<List<Recipe>>
    private val repository: RecipeRepository

    init{
        val recipeDao = RecipeDatabase.getDatabase(application).recipeDao()
        repository = RecipeRepository(recipeDao)
        readAllData = repository.readAllData
    }
}