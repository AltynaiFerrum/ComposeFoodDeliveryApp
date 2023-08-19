package com.jyldyzferr.composefooddeliveryapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jyldyzferr.composefooddeliveryapp.data.models.FoodCache
import kotlinx.coroutines.flow.Flow

@Dao

interface FoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNewTask(food: FoodCache)

    @Query("SELECT * FROM food_table")
    fun fetchAllTasks(): List<FoodCache>

    @Query("SELECT * FROM food_table")
    fun fetchAllTasksFlow(): Flow<List<FoodCache>>

}