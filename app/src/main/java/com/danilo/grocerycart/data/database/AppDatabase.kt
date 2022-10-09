package com.danilo.grocerycart.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.danilo.grocerycart.data.database.dao.GroceryCartDao
import com.danilo.grocerycart.data.database.entity.GroceryCart

@Database(entities = [GroceryCart::class], version = 1)
@TypeConverters(value = [DataTypeConverter::class])
abstract class AppDatabase : RoomDatabase() {
    abstract fun groceryDao(): GroceryCartDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "grocery")
                .build()
        }
    }
}