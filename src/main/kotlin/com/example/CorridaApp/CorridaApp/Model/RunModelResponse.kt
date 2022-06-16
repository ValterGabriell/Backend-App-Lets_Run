package com.example.CorridaApp.CorridaApp.Model

data class RunModelResponse(
    val runId: Int?,
    val userId: Int,
    val username: String,
    val timRunInSeconds: String,
    val runFeeling: String,
    val avergedSpeed: Double,
    val totalDistance: Double,
    val note: String,
    val isDay: Boolean,
    val isCity: Boolean,
    val dateRun: String,
    val imgRun : ByteArray? = null
)