package com.example.spring_in_action_taco_1.repository.datajpa;

import com.example.spring_in_action_taco_1.model.Ingredient;

import java.util.List;

public interface TacoRepository {

    Ingredient save(Ingredient ingredient);

    boolean delete(int id);

    Ingredient get(int id);

    List<Ingredient> getAll();


}
