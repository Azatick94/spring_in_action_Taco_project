package com.example.spring_in_action_taco_1.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="Taco")
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    @Column(name="name")
    private String name;

    @Column(name="created_at")
    private Date createdAt;

    // Taco can have many Ingredient objects, and an Ingredient can be a part of many Tacos.
    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    @PrePersist //
    void createdAt() {
        this.createdAt = new Date();
    }
}
