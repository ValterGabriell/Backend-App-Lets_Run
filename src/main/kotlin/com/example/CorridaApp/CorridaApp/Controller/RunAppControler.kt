package com.example.CorridaApp.CorridaApp.Controller

import com.example.CorridaApp.CorridaApp.Mapper.RunMapper
import com.example.CorridaApp.CorridaApp.Model.RunModelRequest
import com.example.CorridaApp.CorridaApp.Model.RunModelResponse
import com.example.CorridaApp.CorridaApp.Service.RunAppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import kotlin.streams.toList


@RestController
@RequestMapping("/runapp")
class RunAppControler(@Autowired val runAppService: RunAppService) {
    private val runMapper = RunMapper()

    @PostMapping("/postRun")
    fun addNewRun(@RequestBody runModelRequest: RunModelRequest): ResponseEntity<RunModelResponse> {
        var runModelDTO = runMapper.requestToDTO(runModelRequest)
        runModelDTO = runAppService.addNewRun(runModelDTO)
        var runAppResponse = runMapper.dTOtoResponse(runModelDTO)
        return ResponseEntity(runAppResponse, HttpStatus.CREATED)
    }

    @GetMapping("/getAll/{userId}")
    fun getAll(@PathVariable userId: String): ResponseEntity<List<RunModelResponse>> {
        val runModelDTOList = runAppService.getAll(userId)
        val runModelReponseList = runModelDTOList.stream().map {
            runMapper.dTOtoResponse(it)
        }.toList()

        return ResponseEntity(runModelReponseList, HttpStatus.OK)
    }

    @GetMapping("/orderByDate/{userId}")
    fun orderRunByDate(@PathVariable userId: String): ResponseEntity<List<RunModelResponse>> {
        val orderByDateListDTO = runAppService.orderRunByDate(userId)
        val orderByDateListResponse = orderByDateListDTO.stream().map {
            runMapper.dTOtoResponse(it)
        }.toList()
        return ResponseEntity(orderByDateListResponse, HttpStatus.OK)
    }

    @GetMapping("/orderByKm/{userId}")
    fun orderRunByKm(@PathVariable userId: String): ResponseEntity<List<RunModelResponse>> {
        val orderByKMListDTO = runAppService.orderRunByKm(userId)
        val orderByKMListResponse = orderByKMListDTO.stream().map {
            runMapper.dTOtoResponse(it)
        }.toList()
        return ResponseEntity(orderByKMListResponse, HttpStatus.OK)
    }

    @GetMapping("/getLastRun/{userId}")
    fun getLastRun(@PathVariable userId: String): ResponseEntity<RunModelResponse> {
        val lastRunDTO = runAppService.getLastRun(userId)
        val lastRunResponse = runMapper.dTOtoResponse(lastRunDTO)
        return ResponseEntity(lastRunResponse, HttpStatus.OK)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteRunById(@PathVariable id: Int): ResponseEntity<RunModelResponse> {
        runAppService.deleteRunById(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }

    @DeleteMapping("/delete/all")
    fun deleteAllRun(): ResponseEntity<RunModelResponse> {
        runAppService.deleteAllRun()
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }


}