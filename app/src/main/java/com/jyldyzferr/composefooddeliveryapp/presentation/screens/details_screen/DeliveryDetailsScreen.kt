package com.jyldyzferr.composefooddeliveryapp.presentation.screens.details_screen


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jyldyzferr.composefooddeliveryapp.R


@Composable
fun FoodDeliveryDetailScreen(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(
                    top = 25.dp,
                )
        ) {
            MainHeaderContent()
        Spacer(modifier = modifier.height(20.dp))
            FoodDetailContent()
            FoodDescriptionDetail()
        }
    }
}

@Composable
fun MainHeaderContent(

) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.back_food_delivery),
            contentDescription = null,
            tint = colorResource(id = R.color.black),
            modifier = Modifier
                .size(24.dp)

        )
        Icon(
            painter = painterResource(id = R.drawable.bag_food_delivery),
            contentDescription = null,
            tint = colorResource(id = R.color.black),
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun FoodDetailContent(
    modifier: Modifier = Modifier,
    ) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
            .padding(start = 20.dp, bottom = 15.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.4f)
        ) {
            Text(
                text = stringResource(id = R.string.easy_greak_salad),
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            Text(buildAnnotatedString {
                withStyle(style = ParagraphStyle(lineHeight = 25.sp)) {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 14.sp)) {
                        append("Price\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 16.sp
                        )
                    ) {

                    }
                }
            })
            Text(
                text = stringResource(id = R.string.price_d),
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(modifier = modifier.height(20.dp))
            ChoiceQuantity()
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(20.dp),
            contentAlignment = Alignment.BottomEnd,
        ) {
            Image(
                painter = painterResource(id = R.drawable.fdev),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(Color.Transparent)
                    .shadow(20.dp, shape = RoundedCornerShape(150.dp), true)
            )
        }
    }
}

@Composable
fun ChoiceQuantity() {
    val quantity = remember { mutableStateOf(1) }
    Text(
        text = "Choice quantity",
        style = MaterialTheme.typography.bodyLarge
    )
    Row(
        modifier = Modifier
            .padding(top = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
               // .width(24.dp)
               // .height(24.dp)
                .background(Color.White)
                .clickable {
                    if (quantity.value > 0) quantity.value = quantity.value - 1
                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painterResource(id = R.drawable.minus),
                contentDescription = null,
            )
        }
        Text(
            text = quantity.value.toString(),
            style = MaterialTheme.typography.titleSmall
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(6.dp))
                .width(24.dp)
                .height(24.dp)
                .background(Color.White)
                .clickable { quantity.value = quantity.value + 1 },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painterResource(
                    id = R.drawable.plus
                ),
                contentDescription = null,
                )
        }
    }
}

@Composable
fun FoodDescriptionDetail(
    modifier: Modifier = Modifier,
    ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
            .background(Color.White)
    ) {
        Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 40.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Description",
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.headlineLarge
                )
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "star",
                        tint = colorResource(id = R.color.yellow),
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .size(16.dp)
                    )
                    Text(
                        text = "4.9",
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontSize = 16.sp,
                            color =  colorResource(id = R.color.yellow),
                        ),
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
            Spacer(modifier = modifier.height(30.dp))
            Text(
                text = stringResource(id = R.string.description),
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 18.sp,
                    color =  colorResource(id = R.color.description_color),
                ),
                lineHeight = 25.sp
            )
            Spacer(modifier = modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(180.dp)
                        .height(70.dp)
                        .padding(5.dp),
                    shape = RoundedCornerShape(15.dp),
                            colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.black)
                    )
                    ) {
                    Text(
                        text = "Order Now",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                    )
                }
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(5.dp)
                        .size(59.dp),
                    border = BorderStroke(1.dp, colorResource(id = R.color.black)),
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Text(
                        text = "Add Cart",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(5.dp)
                    )
                }
            }
        }
    }
}