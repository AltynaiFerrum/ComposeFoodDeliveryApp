package com.jyldyzferr.composefooddeliveryapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jyldyzferr.composefooddeliveryapp.data.local.dao.FoodDao
import com.jyldyzferr.composefooddeliveryapp.data.models.FoodCache

@Database(
    entities = [FoodCache::class],
    version = 1
)
abstract class FoodDatabase: RoomDatabase(){

    abstract fun fetchFoodDao(): FoodDao
}