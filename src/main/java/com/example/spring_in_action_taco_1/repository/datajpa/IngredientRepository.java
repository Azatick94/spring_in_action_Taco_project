package com.example.spring_in_action_taco_1.repository.datajpa;

import com.example.spring_in_action_taco_1.model.Ingredient;

import java.util.List;

public interface IngredientRepository {

    Ingredient save(Ingredient ingredient);

    boolean delete(int id);

    Ingredient get(String id);

    List<Ingredient> getAll();


}
