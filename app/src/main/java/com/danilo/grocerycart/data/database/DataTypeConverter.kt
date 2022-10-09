package com.danilo.grocerycart.data.database

import androidx.room.TypeConverter
import com.danilo.grocerycart.data.database.entity.GroceryItem
import com.google.gson.Gson

class DataTypeConverter {
    @TypeConverter
    fun fromGroceryItem(groceryItem: GroceryItem): String {
        val gson = Gson()
        return gson.toJson(groceryItem)
    }

    @TypeConverter
    fun toGroceryItem(src: String): GroceryItem {
        val gson = Gson()
        return gson.fromJson(src, GroceryItem::class.java)
    }
}