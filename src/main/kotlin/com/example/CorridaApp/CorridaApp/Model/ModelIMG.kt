package com.example.CorridaApp.CorridaApp.Model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ModelIMG(
    @Id
    val id: Int = 0,
    val img: String = ""
)