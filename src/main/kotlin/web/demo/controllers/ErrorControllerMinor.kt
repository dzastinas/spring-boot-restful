package web.demo.controllers

import org.springframework.boot.autoconfigure.web.ErrorController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import web.demo.model.ErrorJson

//@RestController
class ErrorControllerMinor
//    : ErrorController
{
//    override fun getErrorPath(): String {
//        return "/error"
//    }

//    @RequestMapping("/error")
//    fun error(@RequestParam(value = "status", defaultValue = "404") status: Int): ErrorJson {
//        return ErrorJson.create()
//    }
}