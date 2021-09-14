package com.attrecto.academy.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.attrecto.academy.android.ui.theme.AttrectoAcademyAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttrectoAcademyAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MovieCard(FakeData.movies[0])
                }
            }
        }
    }
}

@Composable
fun MovieCard(movie: Movie) {
    Column {
        Text(movie.title)
        Text(movie.year.toString())
    }
}

@Preview(showBackground = true)
@Composable
fun MovieCardPreview() {
    AttrectoAcademyAndroidTheme {
        MovieCard(FakeData.movies[0])
    }
}