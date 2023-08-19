package com.jyldyzferr.composefooddeliveryapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.jyldyzferr.composefooddeliveryapp.R
import com.jyldyzferr.composefooddeliveryapp.domain.models.Food
import com.jyldyzferr.composefooddeliveryapp.presentation.screens.home_screen.HomeScreen
import com.jyldyzferr.composefooddeliveryapp.presentation.theme.ComposeFoodDeliveryAppTheme
import com.jyldyzferr.composetaskerapp.common.extensions.SpacerHeight

@Preview
@Composable
fun FoodCategoryListPreview() {
    ComposeFoodDeliveryAppTheme {
        FoodCategoryList(recipes = Food.previews)
    }
}



@Composable
fun FoodCategoryList(
    modifier: Modifier = Modifier,
    recipes: List<Food>


) {
    LazyRow {
        items(
            items = recipes,
            key = { data -> data.id }
        ) { recipe ->
            FoodCategoryItem(recipe = recipe)
        }
    }
}

@Composable
fun FoodCategoryItem(
    modifier: Modifier = Modifier,
    recipe: Food
) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .shadow(10.dp, RoundedCornerShape(30.dp), true),
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.heart_food_delivery),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.End)

            )
            Image(
                painter = painterResource(id = R.drawable.fdev),
                contentDescription = null,
                modifier = Modifier
                    .width(142.dp)
                    .height(142.dp)
                    .align(Alignment.CenterHorizontally)
                    .shadow(20.dp, shape = RoundedCornerShape(150.dp), true)

            )
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text = recipe.title,
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text = recipe.description,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 10.sp),
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.width(142.dp)
            )
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text = recipe.price,
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
            )
        }
    }
}







