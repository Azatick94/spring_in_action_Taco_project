package com.example.spring_in_action_taco_1.controller;

import com.example.spring_in_action_taco_1.model.Order;
import com.example.spring_in_action_taco_1.model.Type;
import com.example.spring_in_action_taco_1.model.Ingredient;
import com.example.spring_in_action_taco_1.model.Taco;
import com.example.spring_in_action_taco_1.repository.datajpa.DataJpaIngredientRepository;
//import com.example.spring_in_action_taco_1.repository.datajpa.DataJpaTacoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// The first, @Slf4j, is a Lombok-provided annotation that, at runtime,
//will automatically generate an SLF4J
@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

    private final DataJpaIngredientRepository ingredientRepo;
//    private final DataJpaTacoRepository designRepo;

    @Autowired
    public DesignTacoController(DataJpaIngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
//        this.designRepo = designRepo;
    }

    @ModelAttribute(name = "order")
    public Order order() {
        return new Order();
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = new ArrayList<>(ingredientRepo.getAll());

        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
        return "design_test";
//        return "design";
    }

    @PostMapping
    public String processDesign(
            @Valid Taco design, Errors errors,
            @ModelAttribute Order order) {

        if (errors.hasErrors()) {
            return "design";
        }

//        Taco saved = designRepo.save(design);
//        order.addDesign(saved);

        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(
            List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}