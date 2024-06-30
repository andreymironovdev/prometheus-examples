package com.andreymironov.prometheusdemo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ApiController {
    @GetMapping("/response")
    fun getResponseWithLatency(@RequestParam latency: Long): ResponseEntity<Void> {
        Thread.sleep(latency)
        return ResponseEntity.ok().build()
    }
}