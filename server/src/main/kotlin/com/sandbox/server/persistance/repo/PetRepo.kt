package com.sandbox.server.persistance.repo

import com.sandbox.model.Person
import com.sandbox.model.Pet
import org.springframework.data.repository.CrudRepository

interface PetRepo : CrudRepository<Pet,Long>