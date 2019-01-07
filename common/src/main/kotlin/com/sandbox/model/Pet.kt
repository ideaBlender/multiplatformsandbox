package com.sandbox.model

expect class Pet {
    var id:Long
    val name:String
    var owner:Person?
}