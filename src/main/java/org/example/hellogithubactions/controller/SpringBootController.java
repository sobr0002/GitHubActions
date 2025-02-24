package org.example.hellogithubactions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {

    @GetMapping("/welcome")
    public String returnWelcome() {
        return "welcome";
    }
}
