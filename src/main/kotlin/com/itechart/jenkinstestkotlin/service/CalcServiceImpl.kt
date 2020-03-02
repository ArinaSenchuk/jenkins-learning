package com.itechart.jenkinstestkotlin.service

import com.itechart.jenkinstestkotlin.model.Sum
import org.springframework.stereotype.Service

@Service
class CalcServiceImpl : CalcService {

    override fun getSum(sum: Sum): Int {
        var result = 0
        sum.number.forEach { num ->
            result += num
        }
        return result
    }
}

