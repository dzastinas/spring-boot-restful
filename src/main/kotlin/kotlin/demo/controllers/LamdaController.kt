package kotlin.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.demo.model.LambdaTutorial

@RestController
class LamdaController {

    @RequestMapping("/lambda")
    fun greeting(): LambdaTutorial {
        var math = LambdaTutorial()
        return math
    }
}