package com.application.grocery.cart.domain.repository

import com.application.grocery.cart.data.dao.GroceryListDao
import com.application.grocery.cart.domain.model.GroceryList
import javax.inject.Inject

interface GroceryListRepository {
    suspend fun save(list: GroceryList)
    suspend fun findAll(): List<GroceryList>
    suspend fun findByName(name: String): GroceryList?
    suspend fun findById(id: Int): GroceryList?
}

class GroceryListRepositoryImpl @Inject constructor(private val groceryListDao: GroceryListDao) :
    GroceryListRepository {
    override suspend fun save(list: GroceryList) = groceryListDao.save(list)
    override suspend fun findAll() = groceryListDao.findAll()
    override suspend fun findByName(name: String) = groceryListDao.findByName(name)
    override suspend fun findById(id: Int) = groceryListDao.findById(id)
}