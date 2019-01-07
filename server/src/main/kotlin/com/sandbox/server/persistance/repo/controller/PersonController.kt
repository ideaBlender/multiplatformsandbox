package com.sandbox.server.persistance.repo.controller

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.sandbox.STUB_PERSON
import com.sandbox.dto.PersonDto
import com.sandbox.server.persistance.repo.PersonRepo
import kotlinx.serialization.json.JSON
import org.springframework.web.bind.annotation.*


@RequestMapping(STUB_PERSON)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestController
@CrossOrigin(origins = ["*"])
class PersonController(val repo:PersonRepo) {
    @GetMapping()
    fun findAll(): List<PersonDto> {
        val foo = repo.findAll()
        return repo.findAll().map { it.toDto() }.toList() as List<PersonDto>
    }

    @PostMapping("/{id}")
    fun updateBlogPost(@RequestBody dto: PersonDto): Any {
       return dto
    }
}