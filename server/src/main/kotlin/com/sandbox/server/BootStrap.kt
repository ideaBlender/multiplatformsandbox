package com.sandbox.server

import com.sandbox.model.DateTime
import com.sandbox.model.Person
import com.sandbox.model.Pet
import com.sandbox.server.persistance.repo.PersonRepo
import com.sandbox.server.persistance.repo.PetRepo
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class BootStrap : InitializingBean {
    @Autowired
    lateinit var personRepo: PersonRepo

    @Autowired
    lateinit var petRepo: PetRepo

    override fun afterPropertiesSet() {
        val pet1 = Pet(id=0,name = "Buddy", owner = null)
        val pet2 = Pet(id=0,name = "Jaws", owner = null)
        val pet3 = Pet(id=0,name = "Garfield", owner = null)

        val person1 = Person(
                id=0,
                internalTemp = 98.6,
                age = 41,
                userName = "cLegge",
                birthDayP = Date(1977,12,7),
                birthDay = DateTime(),
                pets = listOf(pet1, pet3)
        )
        pet1.owner = person1
        pet3.owner = person1

        val person2 = Person(
                id=0,
                internalTemp = 198.33,
                age = 99,
                userName = "bRuth",
                birthDayP = Date(1977,12,7),
                birthDay = DateTime(),
                pets = listOf()
        )

        val person3 = Person(
                id=0,internalTemp = 12.77,
                age = 99,
                userName = "mJordan",
                birthDayP = Date(1977,12,7),
                birthDay = DateTime(),
                pets = listOf(pet2)
        )
        pet2.owner = person3

        personRepo.save(person1)
/*        personRepo.save(person2)
        personRepo.save(person3)*/

        val foo = personRepo.findAll()
        val bar = petRepo.findAll()

        val maam = false
    }
}