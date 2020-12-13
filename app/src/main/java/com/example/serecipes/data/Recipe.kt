package com.example.serecipes.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName ="recipe_table")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val cobaltCost: Float,
    val goldCost: Float,
    val ironCost: Float,
    val magnesiumCost: Float,
    val nickelCost: Float,
    val platinumCost: Float,
    val siliconCost: Float,
    val silverCost: Float,
    val gravelCost: Float,
    val uraniumCost: Float
): Parcelable