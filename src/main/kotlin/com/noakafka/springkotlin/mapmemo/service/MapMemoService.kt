package com.noakafka.springkotlin.mapmemo.service

import com.noakafka.springkotlin.mapmemo.data.MapMemo

interface MapMemoService {
    fun addMemo(mapMemo: MapMemo)
}