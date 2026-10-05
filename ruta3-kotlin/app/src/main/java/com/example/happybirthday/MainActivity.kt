package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingCard(
                        message = "Happy Birthday, Android!",
                        from = "From Bryan Rodriguez",
                        code = "23200204"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingCard(message: String, from: String, code: String, modifier: Modifier = Modifier) {
    // 1. Box: Contenedor principal que ocupa toda la pantalla y define el fondo
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9)) // Verde suave
            .padding(16.dp)
    ) {
        // 2. Column: Organiza verticalmente el mensaje y el subtítulo en el centro
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = message,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 38.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF1B5E20)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Desarrollo de Sistemas Móviles",
                fontSize = 18.sp,
                color = Color.DarkGray
            )
        }

        // 3. Row: Organiza horizontalmente el autor y código en la parte inferior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = from,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF2E7D32)
            )
            Text(
                text = "Cód: $code",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF2E7D32)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingCard(
            message = "Happy Birthday, Android!",
            from = "From Bryan Rodriguez",
            code = "23200204"
        )
    }
}