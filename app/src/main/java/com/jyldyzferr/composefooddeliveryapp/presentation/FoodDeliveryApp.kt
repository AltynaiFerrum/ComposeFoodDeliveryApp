package com.jyldyzferr.composefooddeliveryapp.presentation

import android.app.Application
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import com.jyldyzferr.composefooddeliveryapp.data.local.FoodDatabase

class FoodDeliveryApp: Application() {

    override fun onCreate() {
        super.onCreate()
        database = databaseBuilder(
            this, FoodDatabase::class.java,
            "food_delivery__app_database"
        ).allowMainThreadQueries().build()
    }
    companion object {
        lateinit var database: FoodDatabase
    }
}