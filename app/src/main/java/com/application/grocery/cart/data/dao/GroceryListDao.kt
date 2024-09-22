package com.application.grocery.cart.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.application.grocery.cart.domain.model.GroceryList

@Dao
interface GroceryListDao {
    @Insert
    suspend fun save(groceryList: GroceryList)

    @Query("select * from grocerylist")
    suspend fun findAll(): List<GroceryList>

    @Query("select * from grocerylist where name = :name")
    suspend fun findByName(name: String): GroceryList?

    @Query("select * from grocerylist where id = :id")
    suspend fun findById(id: Int): GroceryList?
}