package com.danilo.grocerycart.data.database.entity

import com.danilo.grocerycart.data.model.GroceryCategory

class GroceryItem {
    lateinit var category: GroceryCategory
    lateinit var name: String
    var price: Double = 0.0
}