package com.example.CorridaApp.CorridaApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RunAppApplication

fun main(args: Array<String>) {
	runApplication<RunAppApplication>(*args)
}
