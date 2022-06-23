package com.noakafka.springkotlin.mapmemo.data

import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@Builder
@NoArgsConstructor
class MapMemo(var latitude : Double, var longitude : Double, var city : String, var memo : String ){

}
