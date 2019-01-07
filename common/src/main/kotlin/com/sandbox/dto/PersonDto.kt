package com.sandbox.dto

import com.sandbox.model.DateTime
import kotlinx.serialization.Serializable

@Serializable
data class PersonDto(override var id: Int,
                     override var dateCreated: DateTime = DateTime(),
                     override var dateUpdated: DateTime = DateTime(),
                     var internalTemp:Double,
                     var age: Int,
                     var userName:String,
                     var birthDay:DateTime,
                     var pets:List<DtoMin>
                     ):DataTransportObject(id,dateCreated,dateUpdated)