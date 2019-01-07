package com.sandbox.dto

import com.sandbox.model.DateTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
abstract class DataTransportObject (
        @Transient
        open var id:Int = 0,
        @Transient
        open var dateCreated:DateTime = DateTime(),
        @Transient
        open var dateUpdated:DateTime = DateTime()
)