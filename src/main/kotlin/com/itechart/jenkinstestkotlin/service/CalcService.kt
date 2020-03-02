package com.itechart.jenkinstestkotlin.service

import com.itechart.jenkinstestkotlin.model.Sum

interface CalcService {

    fun getSum(sum: Sum): Int

}
