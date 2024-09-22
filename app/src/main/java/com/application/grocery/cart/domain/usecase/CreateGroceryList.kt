package com.application.grocery.cart.domain.usecase

import com.application.grocery.cart.domain.model.GroceryList
import com.application.grocery.cart.domain.repository.GroceryListRepository
import com.application.grocery.cart.exception.GroceryListAlreadyRegistered
import javax.inject.Inject

interface CreateGroceryList {
    suspend fun create(name: String, budget: Double)
}

class CreateGroceryListImpl @Inject constructor(private val groceryListRepository: GroceryListRepository) :
    CreateGroceryList {
    override suspend fun create(name: String, budget: Double) {
        groceryListRepository.findByName(name)?.let {
            throw GroceryListAlreadyRegistered()
        }

        val groceryList = GroceryList(name = name, budget = budget)
        groceryListRepository.save(groceryList)
    }
}