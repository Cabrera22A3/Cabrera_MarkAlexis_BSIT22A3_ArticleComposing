package com.example.cabrera_markalexis_bsit22a3_pcb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cabrera_markalexis_bsit22a3_pcb.ui.theme.Cabrera_MarkAlexis_BSIT22A3_PCBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cabrera_MarkAlexis_BSIT22A3_PCBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        "Jetpack Compose tutorial",
                        "Jetpack Compose is a modern toolkit for building native " +
                                "Android UI. Compose simplifies and accelerates UI development " +
                                "on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        "In this tutorial, you build a simple UI component with declarative " +
                                "functions. You call Compose functions to say what elements you want " +
                                "and the Compose compiler does the rest. Compose is built around " +
                                "Composable functions. These functions let you define your app's " +
                                "UI programmatically because they let you describe how it should look " +
                                "and provide dependencies, rather than focus on the process of the " +
                                "UIs construction, such as initializing an element and then " +
                                "attaching it to a parent. To create a Composable function, " +
                                "you add the @Composable annotation to the function name."
                    )
                    GreetingImage()
                }
            }
        }
    }
}

@Composable
fun GreetingImage() {
    val image = painterResource(R.drawable.headerpic1)
    Image(
        painter = image,
        contentDescription = null,
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Greeting(title: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Column {
        Row {
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = modifier.padding(all = 16.dp)
            )
        }
        Row {
            Text(
                text = paragraph1,
                fontSize = 14.sp,
                textAlign = TextAlign.Justify,
                modifier = modifier.padding(start = 16.dp, end = 16.dp)
            )
        }
        Row{
            Text(
                text = paragraph2,
                fontSize = 14.sp,
                textAlign = TextAlign.Justify,
                modifier = modifier.padding(all = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cabrera_MarkAlexis_BSIT22A3_PCBTheme {
        Column {
            Row {
                GreetingImage()
            }
            Row {
                Greeting(
                    "Jetpack Compose tutorial",
                    "Jetpack Compose is a modern toolkit for building native " +
                            "Android UI. Compose simplifies and accelerates UI development " +
                            "on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                    "In this tutorial, you build a simple UI component with declarative " +
                            "functions. You call Compose functions to say what elements you want " +
                            "and the Compose compiler does the rest. Compose is built around " +
                            "Composable functions. These functions let you define your app's " +
                            "UI programmatically because they let you describe how it should look " +
                            "and provide dependencies, rather than focus on the process of the " +
                            "UIs construction, such as initializing an element and then " +
                            "attaching it to a parent. To create a Composable function, " +
                            "you add the @Composable annotation to the function name."
                )
            }
        }
    }
}
