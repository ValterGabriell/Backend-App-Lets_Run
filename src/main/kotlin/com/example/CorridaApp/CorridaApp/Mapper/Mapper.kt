package com.example.CorridaApp.CorridaApp.Mapper

interface Mapper<DTO,MODEL> {
    fun fromEntity(entity: MODEL): DTO
    fun toModel(domain: DTO): MODEL
}

interface MapperTwo<DTO, REQUEST, RESPONSE> {
    fun requestToDTO(request: REQUEST): DTO
    fun dTOtoResponse(dto: DTO): RESPONSE
}