package com.hgm.androidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hgm.androidlibrary.ui.theme.AndroidLibraryTheme
import com.hgm.image_preview.ImagePreview

class MainActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                  AndroidLibraryTheme {
                        //ImagePreview(
                        //      image = ,
                        //      description = "Hello kermit..."
                        //)
                  }
            }
      }
}
