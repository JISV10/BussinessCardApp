package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinessCard()
                }
            }
        }
    }
}

@Composable
fun Profile(fullName: String, title: String,  modifier: Modifier = Modifier) {

    val picture = painterResource(id = R.drawable.javier)

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
) {
      Box(
          modifier = Modifier
              .size(200.dp)
              .clip(CircleShape)
      ){
          Image(painter = picture ,
          contentDescription = "Profile Picture",
          modifier = Modifier
              .fillMaxSize()
        )}

        Text(
            fontWeight = FontWeight(900),
            fontSize = 30.sp,
            color = Color.White,
            text = fullName,
            modifier = Modifier

        )
        Text(
            fontStyle = FontStyle(1),
            fontSize = 20.sp,
            color = Color.White,
            text = title,
            modifier = Modifier
        )
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column (modifier = modifier,
    horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center

            ){
        Row {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "Phone",
                tint = Color.White,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                color = Color.White,
                text = stringResource(R.string.phone),
                modifier = Modifier.padding(4.dp)
            )
        }

        Row {
            Icon(
                imageVector = Icons.Rounded.AccountCircle,
                contentDescription = "Phone",
                tint = Color.White,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = stringResource(R.string.linkedin),
                color = Color.White,
                modifier = Modifier.padding(4.dp)
            )
        }

        Row {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Phone",
                tint = Color.White,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                color = Color.White,
                text = stringResource(R.string.email),
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun BussinessCard(modifier: Modifier = Modifier
   ) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Black),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {

        Profile("Javier Saez", "Software Developer Student", modifier = Modifier.weight(3f))
        ContactInfo(modifier = Modifier.weight(1f))
    }
}


@Preview
@Composable
fun BussinessCardPreview() {
    BusinessCardAppTheme {
        BussinessCard()

    }
}
