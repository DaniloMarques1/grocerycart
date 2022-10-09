package com.danilo.grocerycart.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.danilo.grocerycart.data.database.entity.GroceryCart

@Dao
interface GroceryCartDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(groceryCart: GroceryCart)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(groceryCart: GroceryCart)

    @Query("SELECT * FROM grocery_cart WHERE id = :id")
    fun findById(id: String): LiveData<GroceryCart?>
}