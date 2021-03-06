package com.example.spring_in_action_taco_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // returning view name;
        return "home";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello";
    }


}
