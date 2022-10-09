package com.danilo.grocerycart.data.database.repository

import androidx.lifecycle.LiveData
import com.danilo.grocerycart.data.database.dao.GroceryCartDao
import com.danilo.grocerycart.data.database.entity.GroceryCart
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GroceryCartRepository @Inject constructor(private val groceryCartDao: GroceryCartDao) {

    fun insert(groceryCart: GroceryCart) {
        groceryCartDao.insert(groceryCart)
    }

    fun update(groceryCart: GroceryCart) {
        groceryCartDao.update(groceryCart)
    }

    fun findById(id: String): LiveData<GroceryCart?> {
        return groceryCartDao.findById(id)
    }

}