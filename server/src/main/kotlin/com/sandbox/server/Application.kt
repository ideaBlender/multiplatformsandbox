package com.sandbox.server


import com.sandbox.model.DateAudit
import com.sandbox.model.Person
import com.sandbox.model.Pet
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters

@SpringBootApplication
@EntityScan(basePackageClasses = [Application::class, Person::class, DateAudit::class, Pet::class])
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java)
}
