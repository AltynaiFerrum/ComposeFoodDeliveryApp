package com.jyldyzferr.composefooddeliveryapp.domain.usecases

import com.jyldyzferr.composefooddeliveryapp.domain.models.Food
import com.jyldyzferr.composefooddeliveryapp.domain.repository.FoodRepository
import kotlinx.coroutines.flow.Flow

class FetchAllFoodUseCase(
    private val repository: FoodRepository
) {
    operator fun invoke(): Flow<List<Food>> {
        return repository.fetchAllFoodCategoriesFlow()
    }
}