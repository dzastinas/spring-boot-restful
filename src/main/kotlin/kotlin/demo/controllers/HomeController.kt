package kotlin.demo.controllers

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime

class HomeController {

    @RequestMapping("/home")
    fun home(model: Model):String {
        model.addAttribute("now", LocalDateTime.now());
        return "/index.html";
    }

}