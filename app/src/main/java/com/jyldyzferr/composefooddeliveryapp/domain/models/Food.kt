package com.jyldyzferr.composefooddeliveryapp.domain.models

import java.util.UUID

data class Food(
    val id: String,
    val title: String,
    val description: String,
    val price: String,

    ) {


    companion object {
        val preview = Food(
            id = UUID.randomUUID().toString(),
            title = "Eybisi Salad Mix",
            description = "Mix vegetables ingridients",
            price = "$14.99",
            )

        val previews = listOf(
            preview.copy(
                id = UUID.randomUUID().toString(),
            ),
            preview.copy(
                id = UUID.randomUUID().toString(),
            ),
            preview.copy(
                id = UUID.randomUUID().toString(),
            ),
            preview.copy(
                id = UUID.randomUUID().toString(),
            ),

            )
    }
}