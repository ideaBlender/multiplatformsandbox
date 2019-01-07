package com.sandbox.model

import com.sandbox.dto.DataTransportObject
import com.sandbox.dto.DtoMin

expect abstract class DBModel {
    var id: Long
    abstract fun toDtoMin(): DtoMin
    abstract fun toDto(): DataTransportObject
}