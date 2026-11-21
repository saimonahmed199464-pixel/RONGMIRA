package com.rongmira.shop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Product(
    val name: String,
    val price: String
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RongmiraApp()
        }
    }
}

@Composable
fun RongmiraApp() {
    val products = listOf(
        Product("লিপস্টিক", "৳৩৫০"),
        Product("ফেসওয়াশ", "৳৪৫০"),
        Product("কুর্তি", "৳১২০০"),
        Product("থ্রি-পিস", "৳১৮০০"),
        Product("ফেস ক্রিম", "৳৫৫০")
    )

    var cart by remember { mutableStateOf(0) }

    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("RONGMIRA") }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
            ) {
                Text(
                    text = "সৌন্দর্য ও ফ্যাশনের বিশ্বে স্বাগতম",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text("আমাদের পণ্যসমূহ")

                LazyColumn {
                    items(products) { product ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement =
                                    Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(product.name)
                                    Text(product.price)
                                }

                                Button(onClick = { cart++ }) {
                                    Text("কার্টে যোগ")
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text("কার্টে পণ্য: $cart")
            }
        }
    }
}
