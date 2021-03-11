package com.example.spring_in_action_taco_1.repository;

import com.example.spring_in_action_taco_1.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface CrudIngredientRepository extends CrudRepository<Ingredient, String> {

    Ingredient getById(String id);
}
