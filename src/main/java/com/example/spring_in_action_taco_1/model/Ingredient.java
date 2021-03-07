package com.example.spring_in_action_taco_1.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
    // Data Lombok annotation add getter, setters, toString, hashCode, equals realizations

    private final String id;
    private final String name;
    private final Type type;


}
