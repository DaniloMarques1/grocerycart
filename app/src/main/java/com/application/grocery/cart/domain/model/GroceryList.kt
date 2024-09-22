package com.application.grocery.cart.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GroceryList(
    @PrimaryKey(autoGenerate =  true)
    val id: Int? = null,
    val name: String,
    val budget: Double,
)
