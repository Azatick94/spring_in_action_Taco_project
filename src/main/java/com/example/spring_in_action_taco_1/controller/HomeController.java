package com.example.spring_in_action_taco_1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // returning view name;
        log.info("Entering Home Page");
        return "home";
    }
}
