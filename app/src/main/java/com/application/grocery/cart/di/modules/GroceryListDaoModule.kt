package com.application.grocery.cart.di.modules

import com.application.grocery.cart.data.dao.GroceryListDao
import com.application.grocery.cart.data.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GroceryListDaoModule {
    @Provides
    @Singleton
    fun providesGroceryListDao(appDatabase: AppDatabase): GroceryListDao {
        return appDatabase.groceryListDao()
    }

}