package com.sandbox.dto

import com.sandbox.model.DateTime
import kotlinx.serialization.Serializable

@Serializable
data class PetDto(override var id: Int,
                  override var dateCreated: DateTime,
                  override var dateUpdated: DateTime,
                  var owner:DtoMin
                     ):DataTransportObject(id,dateCreated,dateUpdated)