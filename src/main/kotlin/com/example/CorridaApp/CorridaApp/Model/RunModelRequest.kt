package com.example.CorridaApp.CorridaApp.Model

data class RunModelRequest(
    var runId: Int? = 0,
    val userId: String = "",
    val username: String = "",
    val timRunInSeconds: String = "",
    val runFeeling: String = "",
    val avergedSpeed: Double = 0.00,
    val totalDistance: Double = 0.00,
    val note: String = "",
    val isDay: String = "",
    val isCity: String = "",
    val dateRun: String = "",
    val img:String = ""
)