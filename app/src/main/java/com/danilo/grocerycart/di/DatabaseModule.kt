package com.danilo.grocerycart.di

import android.content.Context
import com.danilo.grocerycart.data.database.AppDatabase
import com.danilo.grocerycart.data.database.dao.GroceryCartDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideGroceryDao(appDatabase: AppDatabase): GroceryCartDao {
        return appDatabase.groceryDao()
    }
}