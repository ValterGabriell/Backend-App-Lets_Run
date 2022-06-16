package com.example.CorridaApp.CorridaApp.Service

import com.example.CorridaApp.CorridaApp.Mapper.RunMapper
import com.example.CorridaApp.CorridaApp.Model.RunModelDTO
import com.example.CorridaApp.CorridaApp.Repository.RunAppRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class RunAppService(@Autowired private val runAppRepository: RunAppRepository) {

    private val runMapper = RunMapper()

    fun addNewRun(runModelDTO: RunModelDTO): RunModelDTO {
        runModelDTO.runId = null
        var runAppModel = runMapper.toModel(runModelDTO)
        runAppModel = runAppRepository.save(runAppModel)
        runModelDTO.runId = runAppModel.runId
        return runModelDTO
    }

    fun getAll(): List<RunModelDTO> {
        val list = runAppRepository.findAll()
        return list.stream().map {
            runMapper.fromEntity(it)
        }.toList()
    }

    fun orderRunByDate(): List<RunModelDTO> {
        val list = runAppRepository.findAll(Sort.by(Sort.Direction.DESC, "dateRun"))
        return list.stream().map {
            runMapper.fromEntity(it)
        }.toList()
    }

    fun orderRunByKm(): List<RunModelDTO> {
        val list = runAppRepository.findAll(Sort.by(Sort.Direction.DESC, "totalDistance"))
        return list.stream().map {
            runMapper.fromEntity(it)
        }.toList()
    }

    fun getLastRun(): RunModelDTO {
        val lastRun = runAppRepository.findAll().last()
        return runMapper.fromEntity(lastRun)
    }

    fun deleteRunById(id: Int) {
        val runToDelete = runAppRepository.findById(id)
        if (runToDelete.isPresent) {
            runAppRepository.deleteById(id)
        }
    }

    fun deleteAllRun() {
        runAppRepository.deleteAll()
    }


}