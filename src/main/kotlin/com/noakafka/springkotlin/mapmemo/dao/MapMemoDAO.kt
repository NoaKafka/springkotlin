package com.noakafka.springkotlin.mapmemo.dao

import com.noakafka.springkotlin.mapmemo.data.MapMemo

interface MapMemoDAO {
    fun addMapMemo(mapMemo: MapMemo)
}