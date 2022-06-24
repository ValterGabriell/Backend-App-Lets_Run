package com.example.CorridaApp.CorridaApp.Model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class RunModelApp(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val runId: Int? = 0,
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