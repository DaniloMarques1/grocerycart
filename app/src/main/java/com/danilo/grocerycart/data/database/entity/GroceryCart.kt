package com.danilo.grocerycart.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocery_cart")
data class GroceryCart(
    @PrimaryKey
    val id: String,
    val name: String,
    val prevision: Double,
    val groceryItem: GroceryItem
)