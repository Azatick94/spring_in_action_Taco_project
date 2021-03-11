package com.example.spring_in_action_taco_1.repository.datajpa;

import com.example.spring_in_action_taco_1.model.Ingredient;
import com.example.spring_in_action_taco_1.repository.CrudIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DataJpaIngredientRepository implements IngredientRepository {

    @PersistenceContext
    private EntityManager em;

    private final CrudIngredientRepository crudIngredientRepository;

    @Autowired
    public DataJpaIngredientRepository(CrudIngredientRepository crudIngredientRepository) {
        this.crudIngredientRepository = crudIngredientRepository;
    }


    @Override
    public Ingredient save(Ingredient ingredient) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Ingredient get(String id) {
        crudIngredientRepository.getById(id);
        return null;
    }

    @Override
    public List<Ingredient> getAll() {
        return (List<Ingredient>) crudIngredientRepository.findAll();
    }
}
