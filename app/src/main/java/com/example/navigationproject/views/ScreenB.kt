package com.example.navigationproject.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationproject.navigation.Router

@Composable
fun ScreenB(navController: NavController,name : String, surname : String){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        //vaiggation işlemlerinden sonra değişkenleri ekleyeceğiz
        Text(text = "merhabalar ben $name $surname", fontSize = 25.sp)

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(Router.ScreenA)
        }) {
            Text(text = "SayfaA'ya git")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenBPreview(){
    ScreenB(rememberNavController(),"","")
}