package com.example.CorridaApp.CorridaApp.Repository

import com.example.CorridaApp.CorridaApp.Model.ModelIMG
import com.example.CorridaApp.CorridaApp.Model.RunModelApp
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ImgRepository : JpaRepository<ModelIMG, Int> {


}