package com.noakafka.springkotlin.mapmemo.dao

import com.noakafka.springkotlin.mapmemo.data.MapMemo
import org.springframework.stereotype.Repository

@Repository
class MemoryMapMemoDAO : MapMemoDAO {
    override fun addMapMemo(mapMemo: MapMemo) {
        TODO("Not yet implemented")
    }
}