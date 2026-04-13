package com.aulasandroid.pokemon_api.screens

import android.R.attr.top
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.pokemon_api.R

@Composable
fun pokemonScreen(modifier: Modifier = Modifier) {

    val corFundo = Color(231,229,232)

    Column( modifier = Modifier
        .fillMaxSize()
        .background(corFundo)
        .padding(top = 20.dp)
    ) {
        Row(modifier = Modifier
            .background(Color(217, 19, 57))
            .fillMaxWidth()
            .height(75.dp)
            .padding(start = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.Start)

        ) {
            Image(
                painter = painterResource(R.drawable.pokeball),
                contentDescription = "logo app",
                modifier = Modifier.size(35.dp)

            )

            Text(text= "Pokédex",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontStyle = FontStyle.Normal
            )

        } // fecha linha da logo

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center

        ) {
            OutlinedTextField( modifier = Modifier
                .width(380.dp)
                .height(20.dp),
                value = "",
                onValueChange = {

                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {Text(text = "Nome ou ID", fontSize = 8.sp, color = Color.Black)
                },
                shape = RoundedCornerShape(
                    topStart = 12.dp,
                    topEnd = 12.dp,
                    bottomStart = 12.dp,
                    bottomEnd = 12.dp
                ),
                trailingIcon = {
                    IconButton (
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "icone pesquisa"
                        )
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    unfocusedBorderColor = Color.LightGray
                )
            )
        }// fecha linha do campo de pesquisa

        LazyVerticalGrid ( columns = GridCells.FixedSize(135.dp)
        ) {
            items(15) { cardPokemon() }

        }

    }// fecha a coluna
}

@Composable
fun cardPokemon(modifier: Modifier = Modifier) {
    Card( modifier = Modifier
        .offset(y = 40.dp)
        .padding(5.dp)
        .size(120.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.Blue)
    )
    {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
               verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "#001",
                    fontSize = 12.sp,

                    )

            }
            Spacer(modifier = Modifier.height(40.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue),
                //verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "nome",
                    fontSize = 16.sp,
                    color = Color.White
                    )
            }


        }
      }
    }

}