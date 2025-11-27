package com.example.a116_roomdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a116_roomdatabase.ui.theme.A116RoomDatabaseTheme

import com.example.a116_roomdatabase.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Ini konteks Composable, aman memanggil fungsi Composable
            A116RoomDatabaseTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    // SiswaApp adalah Composable, jadi bisa dipanggil di sini
                    SiswaApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


