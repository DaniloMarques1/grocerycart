package com.application.grocery.cart.domain.usecase

import com.application.grocery.cart.domain.model.GroceryList
import com.application.grocery.cart.domain.repository.GroceryListRepository
import javax.inject.Inject

interface FindAllGroceryList {
    suspend fun find(): List<GroceryList>
}

class FindAllGroceryListImpl @Inject constructor(private val repository: GroceryListRepository) :
    FindAllGroceryList {
    override suspend fun find() = repository.findAll()
}