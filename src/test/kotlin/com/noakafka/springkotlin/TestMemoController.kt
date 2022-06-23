package com.noakafka.springkotlin

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@WebMvcTest // MVC와 관련된 클래스들만 로딩, MVC (단위)테스트 하기위해
@AutoConfigureMockMvc   // 자동으로 MockMvc 설정
class TestMemoController {
    @Autowired  // 자동으로 MockMvc관련해서 주입을 시켜줌
    lateinit var mockMvc: MockMvc

    @Test
    fun helloTest() {
        mockMvc.perform(
            get("/mapmemo/add")
        ).andExpect(
            status().`is`(200)
        ).andExpect(
            content().string("hello API")
        )
    }

}

