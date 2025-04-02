package com.example.navigationproject.navigation


import kotlinx.serialization.Serializable

sealed class Router {

    @Serializable
    data object ScreenA

    @Serializable
    data class ScreenB(
        val name:String,
        val surname:String
    )
}