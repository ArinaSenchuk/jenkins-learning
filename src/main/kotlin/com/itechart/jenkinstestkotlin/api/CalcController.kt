package com.itechart.jenkinstestkotlin.api

import com.itechart.jenkinstestkotlin.model.Sum
import com.itechart.jenkinstestkotlin.service.CalcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/calc")
class CalcController {

    @Autowired
    private lateinit var calcService: CalcService

    @GetMapping
    fun getSum(@RequestBody sum: Sum): Int {
        return calcService.getSum(sum)
    }

}
