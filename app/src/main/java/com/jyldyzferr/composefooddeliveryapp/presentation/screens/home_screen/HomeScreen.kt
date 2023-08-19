package com.jyldyzferr.composefooddeliveryapp.presentation.screens.home_screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.google.android.material.search.SearchBar
import com.jyldyzferr.composefooddeliveryapp.R
import com.jyldyzferr.composefooddeliveryapp.domain.models.Food
import com.jyldyzferr.composefooddeliveryapp.domain.models.FoodCategory
import com.jyldyzferr.composefooddeliveryapp.presentation.components.FoodCategoryList
import com.jyldyzferr.composefooddeliveryapp.presentation.theme.ComposeFoodDeliveryAppTheme
import com.jyldyzferr.composefooddeliveryapp.presentation.theme.ExtraMediumSpacing
import com.jyldyzferr.composefooddeliveryapp.presentation.theme.LargeSpacing
import com.jyldyzferr.composefooddeliveryapp.presentation.theme.MediumSpacing
import com.jyldyzferr.composefooddeliveryapp.presentation.theme.SmallSpacing
import com.jyldyzferr.composetaskerapp.common.extensions.SpacerWidth

@Preview
@Composable
fun HomeScreenPreview() {
    ComposeFoodDeliveryAppTheme {
        HomeScreen(recipes = Food.previews)
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    recipes: List<Food>
) {
    Column(
        modifier = Modifier
            .padding(
                start = 15.dp,
                top = 25.dp,
                bottom = 15.dp,
                end = 15.dp)
    ) {
        MainHeader()
        MainHeaderText()
        Spacer(modifier = modifier.height(30.dp))
        FourCategory()
        Spacer(modifier = modifier.height(30.dp))
        FoodCategoryList(recipes = recipes)
        }

    }

@Composable
fun MainHeader(
    modifier: Modifier = Modifier
) {
    Box( modifier = modifier
        .statusBarsPadding()
        .systemBarsPadding()
        .padding(10.dp)
        .fillMaxWidth()
    ) {
        Spacer(modifier = modifier.padding(top = 40.dp))
        Row{
            SpacerWidth(dp = 5.dp)
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.nav_draw_food_delivery),
                    contentDescription = null,
                )
        }
            Spacer(modifier = modifier.weight(1f))
            AsyncImage(
                modifier = modifier
                    .padding(end = 21.dp)
                    .padding(top = 5.dp)
                    .size(58.dp)
                    .border(
                        width = 1.dp, brush = Brush.horizontalGradient(
                            colors = listOf(colorResource(id = R.color.red), Color.White)
                        ),
                        shape = (CircleShape)
                    )
                    .size(37.dp)
                    .clip(CircleShape),
                model = R.drawable.profile_food_delivery,
                contentDescription = null,
                contentScale = ContentScale.Crop

            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainHeaderText() {
    Column(modifier = Modifier.padding(top = 20.dp)) {
        Text(
            text = "Enjoy your favourite\nfood delicious",
            modifier = Modifier.padding(bottom = 10.dp),
            style = MaterialTheme.typography.headlineLarge
        )
        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_search),
                    contentDescription = "Search",
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .border(width = 0.dp, Color.White, shape = RoundedCornerShape(15.dp)),
            shape = RoundedCornerShape(15.dp),
            placeholder = {
                Text(
                    text = "Search...",
                    style = MaterialTheme.typography.titleSmall,
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            )

        )
    }
}

@Composable
fun FourCategory(
    modifier: Modifier = Modifier,
) {
    LazyRow {
        val texts = listOf(
            "All",
            "Healthy food",
            "Junk food",
            "Dessert"
        )
        items(texts) { text ->
            Text(
                text = text,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier.padding(22.dp),
                color = colorResource(id = R.color.large_gray),

            )
        }
    }
}


