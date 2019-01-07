package com.sandbox.model

import com.sandbox.dto.DataTransportObject
import com.sandbox.dto.DtoMin
import com.sandbox.dto.PersonDto
import com.sandbox.model.extensions.toDateTime
import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToMany

@Entity
actual data class Person(actual override var id: Long,
                         actual val internalTemp: Double,
                         actual val age: Int,
                         actual val userName: String,
                         val birthDayP: Date,
                         @Transient
                         actual val birthDay: DateTime,

                         @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, orphanRemoval = true,  cascade = [CascadeType.ALL])
                         actual val pets: List<Pet>
) : DBModel(id) {
    override fun toDtoMin(): DtoMin {
       return DtoMin(id=this.id.toInt(), display = userName)
    }

    override fun toDto(): DataTransportObject {
        return PersonDto(
                id=this.id.toInt(),
                age = this.age,
                internalTemp = this.internalTemp,
                userName = this.userName,
                birthDay = this.birthDayP.toDateTime(),
                dateCreated = this.dateCreated.toDateTime(),
                dateUpdated = this.dateUpdated.toDateTime(),
                pets = this.pets.map { it.toDtoMin() }.toList()
        )
    }
}