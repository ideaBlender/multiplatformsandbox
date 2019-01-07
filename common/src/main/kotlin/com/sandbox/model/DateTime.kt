package com.sandbox.model

import kotlinx.serialization.Serializable

@Serializable
data class DateTime(val year: Int =0, val month: Int=0, val day: Int=0, val hour: Int=0, val minute: Int=0)