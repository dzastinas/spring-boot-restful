package kotlin.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.demo.model.Person

@RestController
class PersonController {

    @RequestMapping("/person")
    fun greeting(@RequestParam(value = "name", defaultValue = "Unknown") name: String,
                 @RequestParam(value = "age", defaultValue = "20") age: Int
                 ): Person {
        var jake = Person(name, age, "Stephen's College", "jake.hill@example.com")
        jake.isEligibleToVote()
        return jake
    }
}