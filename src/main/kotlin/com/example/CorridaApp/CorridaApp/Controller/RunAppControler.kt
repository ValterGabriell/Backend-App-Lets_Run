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

    @GetMapping("/getAll")
    fun getAll(): ResponseEntity<List<RunModelResponse>> {
        val runModelDTOList = runAppService.getAll()
        val runModelReponseList = runModelDTOList.stream().map {
            runMapper.dTOtoResponse(it)
        }.toList()
        return ResponseEntity(runModelReponseList, HttpStatus.OK)
    }

    @GetMapping("/orderByDate")
    fun orderRunByDate(): ResponseEntity<List<RunModelResponse>> {
        val orderByDateListDTO = runAppService.orderRunByDate()
        val orderByDateListResponse = orderByDateListDTO.stream().map {
            runMapper.dTOtoResponse(it)
        }.toList()
        return ResponseEntity(orderByDateListResponse, HttpStatus.OK)
    }

    @GetMapping("/orderByKm")
    fun orderRunByKm(): ResponseEntity<List<RunModelResponse>> {
        val orderByKMListDTO = runAppService.orderRunByKm()
        val orderByKMListResponse = orderByKMListDTO.stream().map {
            runMapper.dTOtoResponse(it)
        }.toList()
        return ResponseEntity(orderByKMListResponse, HttpStatus.OK)
    }

    @GetMapping("/getLastRun")
    fun getLastRun(): ResponseEntity<RunModelResponse> {
        val lastRunDTO = runAppService.getLastRun()
        val lastRunResponse =  runMapper.dTOtoResponse(lastRunDTO)
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