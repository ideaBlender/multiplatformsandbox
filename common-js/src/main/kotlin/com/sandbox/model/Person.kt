package com.sandbox.model

actual class Person {
    actual val internalTemp: Double
        get() = TODO("internalTemp:kotlin.Double not implemented")
    actual val age: Int
        get() = TODO("age:kotlin.Int not implemented")
    actual val userName: String
        get() = TODO("userName:kotlin.String not implemented")
    actual val birthDay: DateTime
        get() = TODO("birthDay:com.sandbox.model.DateTime not implemented")
    actual val pets: List<Pet>
        get() = TODO("pets:kotlin.collections.List<com.sandbox.model.Pet> not implemented")
    actual var id: Long
        get() = TODO("id:kotlin.Long not implemented")
        set(value) {}
}