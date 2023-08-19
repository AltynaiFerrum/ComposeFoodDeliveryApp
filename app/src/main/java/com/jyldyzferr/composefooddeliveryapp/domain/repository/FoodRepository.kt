package com.jyldyzferr.composefooddeliveryapp.domain.repository

import com.jyldyzferr.composefooddeliveryapp.domain.models.Food
import kotlinx.coroutines.flow.Flow

interface FoodRepository {

    fun fetchAllFoodCategoriesFlow(): Flow<List<Food>>

}