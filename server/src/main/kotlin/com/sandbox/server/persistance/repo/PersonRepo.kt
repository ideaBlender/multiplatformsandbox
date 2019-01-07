package com.sandbox.server.persistance.repo

import com.sandbox.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepo : CrudRepository<Person,Long>