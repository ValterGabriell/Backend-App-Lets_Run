package com.example.CorridaApp.CorridaApp.Model

data class RunModelResponse(
    val runId: Int?,
    val userId: String = "",
    val username: String,
    val timRunInSeconds: String,
    val runFeeling: String,
    val avergedSpeed: Double,
    val totalDistance: Double,
    val note: String,
    val isDay: String = "",
    val isCity: String = "",
    val dateRun: String,
    val img:String = ""
)