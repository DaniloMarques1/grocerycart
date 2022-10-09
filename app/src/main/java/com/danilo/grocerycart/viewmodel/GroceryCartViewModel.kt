package com.danilo.grocerycart.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.danilo.grocerycart.data.database.entity.GroceryCart
import com.danilo.grocerycart.data.database.entity.GroceryItem
import com.danilo.grocerycart.data.database.repository.GroceryCartRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GroceryCartViewModel @Inject constructor(private val groceryCartRepository: GroceryCartRepository) :
    ViewModel() {

    fun insert(id: String, name: String, prevision: Double) {
        val grocery = GroceryCart(id, name, prevision, GroceryItem())
        viewModelScope.launch {
            groceryCartRepository.insert(grocery)
        }
    }

    fun findById(id: String): LiveData<GroceryCart?> {
        return groceryCartRepository.findById(id)
    }
}