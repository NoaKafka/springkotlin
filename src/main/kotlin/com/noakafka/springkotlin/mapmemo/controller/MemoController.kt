package com.noakafka.springkotlin.mapmemo.controller

import com.noakafka.springkotlin.mapmemo.data.MapMemo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mapmemo")
class MemoController {

    @GetMapping("/add")
    fun add() : String{
            return "hello API"
    }

}