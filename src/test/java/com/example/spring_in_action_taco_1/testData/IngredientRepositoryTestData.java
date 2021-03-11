package com.example.spring_in_action_taco_1.testData;

import com.example.spring_in_action_taco_1.model.Ingredient;
import com.example.spring_in_action_taco_1.model.Type;

import java.util.List;

public class IngredientRepositoryTestData {

    public static final Ingredient ing1 = new Ingredient("FLTO", "Flour Tortilla", Type.WRAP);
    public static final Ingredient ing2 = new Ingredient("COTO", "Corn Tortilla", Type.WRAP);
    public static final Ingredient ing3 = new Ingredient("GRBF", "Ground Beef", Type.PROTEIN);
    public static final Ingredient ing4 = new Ingredient("CARN", "Carnitas", Type.PROTEIN);
    public static final Ingredient ing5 = new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES);
    public static final Ingredient ing6 = new Ingredient("LETC", "Lettuce", Type.VEGGIES);
    public static final Ingredient ing7 = new Ingredient("CHED", "Cheddar", Type.CHEESE);
    public static final Ingredient ing8 = new Ingredient("JACK", "Monterrey Jack", Type.CHEESE);
    public static final Ingredient ing9 = new Ingredient("SLSA", "Salsa", Type.SAUCE);
    public static final Ingredient ing10 = new Ingredient("SRCR", "Sour Cream", Type.SAUCE);

    public static final List<Ingredient> ingredients = List.of(ing1, ing2, ing3, ing4, ing5, ing6, ing7, ing8, ing9, ing10);

    public static List<Ingredient> getAllIngredients() {
        return ingredients;
    }
}
