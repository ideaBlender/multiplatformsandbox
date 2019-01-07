package com.sandbox.model

import com.sandbox.dto.DataTransportObject
import com.sandbox.dto.DtoMin
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
actual abstract class DBModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        actual open var id: Long = 0
) :DateAudit() {
    actual abstract fun toDtoMin(): DtoMin
    actual abstract fun toDto(): DataTransportObject
}