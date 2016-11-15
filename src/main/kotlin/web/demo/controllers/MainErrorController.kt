package web.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import web.demo.model.ErrorJson

@RestController
class MainErrorController {

    @RequestMapping("/error3")
    fun error(@RequestParam(value = "status", defaultValue = "404") status: Int): ErrorJson {
        return ErrorJson.create()
    }
}