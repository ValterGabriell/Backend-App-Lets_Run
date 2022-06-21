package com.example.CorridaApp.CorridaApp.Service

import com.example.CorridaApp.CorridaApp.Mapper.RunMapper
import com.example.CorridaApp.CorridaApp.Model.RunModelDTO
import com.example.CorridaApp.CorridaApp.Repository.RunAppRepository
import org.springframework.beans.factory.annotation.Autowired
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

    fun getAll(userId: String): List<RunModelDTO> {
        val list = runAppRepository.findByUserId(userId)
        val listAux = list.stream().map {
            runMapper.fromEntity(it)
        }.toList()
        return listAux
    }

    fun orderRunByDate(id: String): List<RunModelDTO> {
        val lista = runAppRepository.findByUserId(id).sortedBy {
            it.dateRun
        }
        return lista.stream().map {
            runMapper.fromEntity(it)
        }.toList()
    }

    fun orderRunByKm(id: String): List<RunModelDTO> {
        val list = runAppRepository.findByUserId(id).sortedBy {
            it.totalDistance
        }
        return list.stream().map {
            runMapper.fromEntity(it)
        }.toList()
    }

    fun getLastRun(userId: String): RunModelDTO {
        val lastRun = runAppRepository.findByUserId(userId).last()
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