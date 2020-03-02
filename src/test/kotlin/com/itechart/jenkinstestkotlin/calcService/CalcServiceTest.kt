package com.itechart.jenkinstestkotlin.calcService

import com.fasterxml.jackson.databind.ObjectMapper
import com.itechart.jenkinstestkotlin.model.Sum
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@AutoConfigureMockMvc
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalcServiceTest {

    @Autowired
    lateinit var mockMvc: MockMvc
    @Autowired
    lateinit var objectMapper: ObjectMapper

    @Test
    fun getSum() {
        val sum = Sum()
        sum.addNumber(1)
        sum.addNumber(4)
        sum.addNumber(6)
        sum.addNumber(9)

        val mvcResult = mockMvc.perform(get("/calc")
                                .content(objectMapper.writeValueAsBytes(sum))
                                .contentType(APPLICATION_JSON))
                                .andExpect(status().isOk)
                                .andReturn()

        val response = objectMapper.readValue(mvcResult.response.contentAsByteArray, Int::class.java)

        Assert.assertEquals(response, 20)

    }

}
