package com.sandbox.model

import com.sandbox.dto.DataTransportObject
import com.sandbox.dto.DtoMin
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
actual data class Pet(
        actual override var id: Long,
        actual val name: String,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "owner_id")
        actual var owner: Person?): DBModel(id) {
    override fun toDtoMin(): DtoMin {
        return DtoMin(id=this.id.toInt(), display = name)
    }

    override fun toDto(): DataTransportObject {
        TODO("toDto:com.sandbox.dto.DataTransportObject not implemented")


    }
}