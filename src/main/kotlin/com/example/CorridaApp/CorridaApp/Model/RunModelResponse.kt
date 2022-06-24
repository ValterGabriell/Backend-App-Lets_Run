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
    val turno:String="",
    val local:String="",
    val dateRun: String
)