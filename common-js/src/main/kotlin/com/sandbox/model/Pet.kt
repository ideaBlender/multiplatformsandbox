package com.sandbox.model

actual class Pet {
    actual val name: String
        get() = TODO("name:kotlin.String not implemented")
    actual var owner: Person? = null
        get() = TODO("owner:com.sandbox.model.Person not implemented")
    actual var id: Long
        get() = TODO("id:kotlin.Long not implemented")
        set(value) {}
}