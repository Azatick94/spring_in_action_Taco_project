package com.example.spring_in_action_taco_1.controller;

import com.example.spring_in_action_taco_1.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    // url to submit order attributes
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    // When the processOrder() method is called to handle a submitted order, it’s given an
    //Order object whose properties are bound to the submitted form fields.
    @PostMapping
    public String processOrder(Order order) {
        log.info("Order submitter: " + order);
        return "redirect:/";
    }
}
