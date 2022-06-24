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
            entity.timRunInSeconds,
            entity.runFeeling,
            entity.avergedSpeed,
            entity.totalDistance,
            entity.note,
            entity.turno,
            entity.local,
            entity.dateRun
        )
    }

    override fun toModel(domain: RunModelDTO): RunModelApp {
        return RunModelApp(
            domain.runId,
            domain.userId,
            domain.username,
            domain.timRunInSeconds,
            domain.runFeeling,
            domain.avergedSpeed,
            domain.totalDistance,
            domain.note,
            domain.turno,
            domain.local,
            domain.dateRun
        )
    }

    override fun requestToDTO(request: RunModelRequest): RunModelDTO {
        return RunModelDTO(
            request.runId,
            request.userId,
            request.username,
            request.timRunInSeconds,
            request.runFeeling,
            request.avergedSpeed,
            request.totalDistance,
            request.note,
            request.turno,
            request.local,
            request.dateRun
        )
    }

    override fun dTOtoResponse(dto: RunModelDTO): RunModelResponse {
        return RunModelResponse(
            dto.runId,
            dto.userId,
            dto.username,
            dto.timRunInSeconds,
            dto.runFeeling,
            dto.avergedSpeed,
            dto.totalDistance,
            dto.note,
            dto.turno,
            dto.local,
            dto.dateRun
        )
    }
}