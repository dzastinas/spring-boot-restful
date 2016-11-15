package web.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import web.demo.model.LambdaTutorial

@RestController
class LamdaController {

    @RequestMapping("/lambda")
    fun greeting(): LambdaTutorial {
        val math = LambdaTutorial()
        return math
    }
}