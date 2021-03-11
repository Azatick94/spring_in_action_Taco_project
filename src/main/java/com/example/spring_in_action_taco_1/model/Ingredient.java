package com.example.spring_in_action_taco_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor()
@AllArgsConstructor
@Entity // annotating to declare class as JPA entity
@Table(name = "Ingredient")
public class Ingredient {
    // Data Lombok annotation add getter, setters, toString, hashCode, equals realizations
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "type")
    private Type type;
}
