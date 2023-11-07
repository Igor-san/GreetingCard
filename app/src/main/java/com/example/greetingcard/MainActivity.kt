package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.HappyBirthdayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme  {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //getString() is used for traditional Android development, while stringResource() is used in Jetpack Compose.
//                    GreetingImage(message = stringResource(R.string.happy_birthday_text), from = stringResource(
//                        R.string.signature_text
//                    ))

                    ComposeArticle()
                }
            }
        }
    }
}

@Preview()
@Composable
fun ComposeArticle(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            alpha = 0.5F
        )
        Text(
            text = stringResource(R.string.tutorial_title),
            fontSize = 24.sp,
            textAlign = TextAlign.Left,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.tutorial_anons),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.tutorial_text),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}


//@Composable
//fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
//    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
//        Text(
//            text = message,
//            fontSize = 80.sp,
//            lineHeight = 116.sp,
//            textAlign = TextAlign.Center
//        )
//        Text(
//            text = from,
//            fontSize = 36.sp,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.CenterHorizontally)
//        )
//    }
//}
//
//@Composable
//fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
//    val image = painterResource(R.drawable.androidparty)
////Step 3 create a box to overlap image and texts
//    Box {
//        Image(
//            painter = image,
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            alpha = 0.5F
//        )
//
//        GreetingText(
//            message = message,
//            from = from,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp)
//        )
//    }
//}
//
//
//@Preview(showBackground = true,
//    showSystemUi = true,
//    name="MyPreview")
//@Composable
//fun BirthdayCardPreview() {
//    HappyBirthdayTheme  {
//        GreetingImage("Happy Birthday Sam!", "From Emma")
//    }
//}