package web.demo.controllers

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HomeController {

    @RequestMapping("/home")
    fun home(model: Model): String {
        model.addAttribute("now", LocalDateTime.now())
        return "/index.html"
    }

}