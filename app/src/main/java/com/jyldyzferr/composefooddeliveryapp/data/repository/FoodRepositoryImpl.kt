package com.jyldyzferr.composefooddeliveryapp.data.repository

import com.jyldyzferr.composefooddeliveryapp.domain.models.Food
import com.jyldyzferr.composefooddeliveryapp.domain.repository.FoodRepository
import com.jyldyzferr.composefooddeliveryapp.presentation.FoodDeliveryApp
import kotlinx.coroutines.flow.Flow

class FoodRepositoryImpl: FoodRepository {

    private val dao = FoodDeliveryApp.database.fetchFoodDao()

    override fun fetchAllFoodCategoriesFlow(): Flow<List<Food>> {
        TODO("Not yet implemented")
    }
}


