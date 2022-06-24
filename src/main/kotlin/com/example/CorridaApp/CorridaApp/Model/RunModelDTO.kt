package com.example.CorridaApp.CorridaApp.Model

data class RunModelDTO(
    var runId: Int? = 0,
    val userId: String = "",
    val username: String = "",
    val timRunInSeconds: String = "",
    val runFeeling: String = "",
    val avergedSpeed: Double = 0.00,
    val totalDistance: Double = 0.00,
    val note: String = "",
    val turno:String="",
    val local:String="",
    val dateRun: String = ""
)