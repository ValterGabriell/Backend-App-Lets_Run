package com.example.CorridaApp.CorridaApp.Mapper

import com.example.CorridaApp.CorridaApp.Model.RunModelApp
import com.example.CorridaApp.CorridaApp.Model.RunModelDTO
import com.example.CorridaApp.CorridaApp.Model.RunModelRequest
import com.example.CorridaApp.CorridaApp.Model.RunModelResponse


class RunMapper : Mapper<RunModelDTO, RunModelApp>, MapperTwo<RunModelDTO, RunModelRequest, RunModelResponse> {
    override fun fromEntity(entity: RunModelApp): RunModelDTO {
        return RunModelDTO(
            entity.runId,
            entity.userId,
            entity.username,
            entity.dateRun,
            entity.runFeeling,
            entity.avergedSpeed,
            entity.totalDistance,
            entity.note,
            entity.isDay,
            entity.isCity,
            entity.dateRun
        )
    }

    override fun toModel(domain: RunModelDTO): RunModelApp {
        return RunModelApp(
            domain.runId,
            domain.userId,
            domain.username,
            domain.dateRun,
            domain.runFeeling,
            domain.avergedSpeed,
            domain.totalDistance,
            domain.note,
            domain.isDay,
            domain.isCity,
            domain.dateRun
        )
    }

    override fun requestToDTO(request: RunModelRequest): RunModelDTO {
        return RunModelDTO(
            request.runId,
            request.userId,
            request.username,
            request.dateRun,
            request.runFeeling,
            request.avergedSpeed,
            request.totalDistance,
            request.note,
            request.isDay,
            request.isCity,
            request.dateRun
        )
    }

    override fun dTOtoResponse(dto: RunModelDTO): RunModelResponse {
        return RunModelResponse(
            dto.runId,
            dto.userId,
            dto.username,
            dto.dateRun,
            dto.runFeeling,
            dto.avergedSpeed,
            dto.totalDistance,
            dto.note,
            dto.isDay,
            dto.isCity,
            dto.dateRun
        )
    }
}