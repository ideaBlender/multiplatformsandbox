package com.sandbox.model

expect  class Person {
    var id:Long
    val internalTemp:Double
    val age: Int
    val userName:String
    val birthDay:DateTime
    val pets:List<Pet>
}