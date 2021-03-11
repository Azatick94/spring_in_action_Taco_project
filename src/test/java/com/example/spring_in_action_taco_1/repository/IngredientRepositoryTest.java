package com.example.spring_in_action_taco_1.repository;

import com.example.spring_in_action_taco_1.model.Ingredient;
import com.example.spring_in_action_taco_1.repository.datajpa.DataJpaIngredientRepository;
import com.example.spring_in_action_taco_1.testData.IngredientRepositoryTestData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class IngredientRepositoryTest {

    @Autowired
    DataJpaIngredientRepository dataJpaIngredientRepository;

    @Test
    public void getAllIngredient() {
        List<Ingredient> calculated = dataJpaIngredientRepository.getAll();
        List<Ingredient> expected = IngredientRepositoryTestData.getAllIngredients();
        assertThat(calculated).isEqualTo(expected);
    }

}
