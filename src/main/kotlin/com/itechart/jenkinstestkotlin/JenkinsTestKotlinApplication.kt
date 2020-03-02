package com.itechart.jenkinstestkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JenkinsTestKotlinApplication

fun main(args: Array<String>) {
	runApplication<JenkinsTestKotlinApplication>(*args)
}
