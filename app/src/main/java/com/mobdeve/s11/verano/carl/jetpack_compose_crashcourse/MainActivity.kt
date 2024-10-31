package com.mobdeve.s11.verano.carl.jetpack_compose_crashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobdeve.s11.verano.carl.jetpack_compose_crashcourse.ui.theme.JetpackComposeCrashCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCrashCourseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    // Row - horizontal arrangement; linear layout with horizontal orientation
//    // Column - vertical arrangement; linear layout with vertical orientation
//    Box ( // equivalent to frame layout
////        horizontalAlignment = Alignment.CenterHorizontally, // only works for Column
////        verticalArrangement = Arrangement.Center, // only works for Column
//
//        contentAlignment = Alignment.Center, // works for both Column and Row
//        modifier = modifier
//            .background(Color.Yellow)
//            .size(400.dp)
//            // .fillMaxSize() // fill the entire screen
//            // fillMaxWidth() - fill the entire width
//            // fillMaxHeight() - fill the entire height
//            // size(100.dp) - set the size of the element; 100x100 dp
//
//    ) {
//        Text(
//            text = "Hello $name!!",
//            color = Color.Red,
//            fontWeight = FontWeight.Bold,
//            fontStyle = FontStyle.Italic,
//            modifier = modifier
////                .fillMaxWidth() // fill the entire width of the parent
//                .align(Alignment.BottomEnd)
//
//        )
//        Text(
//            text = "WIGGAasdasdasdas!",
//            color = Color.Red,
//            fontWeight = FontWeight.Bold,
//            fontStyle = FontStyle.Italic,
//
//            modifier = modifier
//
//        )
//    }

    if(name.length > 5){ // adding conditional rendering of UI components
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = modifier
                .size(100.dp)
                .background(Color.White)
        )
    }
    Column {
        for(i in 1..5){ // if we want to repeat a component multiple times
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Android Logo",
                modifier = modifier
                    .background(Color.Black)

            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCrashCourseTheme {
        Greeting("as")
    }
}