package com.sandbox.model

import com.sandbox.dto.DataTransportObject
import com.sandbox.dto.DtoMin

actual abstract class DBModel {
    actual var id: Long
        get() = TODO("id:kotlin.Long not implemented")
        set(value) {}

    actual abstract fun toDtoMin(): DtoMin
    actual abstract fun toDto(): DataTransportObject
}