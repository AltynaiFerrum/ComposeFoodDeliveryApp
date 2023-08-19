package com.jyldyzferr.composefooddeliveryapp.domain.models

import java.util.UUID

data class FoodCategory(
    val id: String,
    val title: String,
    val description: String,
    val price: String,

    ) {


    companion object {
        val preview = Food(
            id = UUID.randomUUID().toString(),
            title = "Description",
            description = "Flavorful chicken broth, crunchy chopped onions, earthy mushrooms, and savory spices all come together to create the most perfect chicken dish ever. Recipe creator Faith recommends that to really take this dish to the next level, it can be served with mushroom rice and asparagus.",
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