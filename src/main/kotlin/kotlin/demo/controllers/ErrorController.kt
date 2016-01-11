package kotlin.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.demo.model.ErrorJson

@RestController
class ErrorController {

    @RequestMapping("/error2")
    fun error(@RequestParam(value = "status", defaultValue = "404") status: Int): ErrorJson {
        return ErrorJson.create();
    }
}