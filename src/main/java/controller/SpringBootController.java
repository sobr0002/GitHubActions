package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {

    @GetMapping()
    public String returnWelcome() {
        return "welcome";
    }
}
