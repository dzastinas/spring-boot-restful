package web.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import web.demo.model.Person

@RestController
class DefautParameters {
    @RequestMapping("/Numbers")
    fun greeting(@RequestParam(value = "name", defaultValue = "Unknown") name: String,
                 @RequestParam(value = "age", defaultValue = "20") age: Int,
                 @RequestParam(value = "email", defaultValue = "no-email@gmail.com") email: String
    ): Person {
        val jake = Person(name, age, "Stephen's College", email)
        jake.isEligibleToVote()
        return jake
    }
}