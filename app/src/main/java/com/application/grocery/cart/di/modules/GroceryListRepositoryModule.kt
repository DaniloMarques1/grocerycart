package com.application.grocery.cart.di.modules

import com.application.grocery.cart.domain.repository.GroceryListRepository
import com.application.grocery.cart.domain.repository.GroceryListRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class GroceryListRepositoryModule {
    @Binds
    abstract fun bindGroceryListRepository(
        groceryListRepository: GroceryListRepositoryImpl
    ): GroceryListRepository
}