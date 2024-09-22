package com.application.grocery.cart.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.application.grocery.cart.data.dao.GroceryListDao
import com.application.grocery.cart.domain.model.GroceryList

@Database(entities = [GroceryList::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun groceryListDao(): GroceryListDao

    companion object {
        private const val DB_NAME = "grocery.db"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun build(applicationContext: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {

                    instance = Room.databaseBuilder(
                        applicationContext,
                        AppDatabase::class.java,
                        DB_NAME
                    ).build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}