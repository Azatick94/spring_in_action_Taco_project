//package com.example.spring_in_action_taco_1.repository.datajpa;
//
//import com.example.spring_in_action_taco_1.model.Ingredient;
//import com.example.spring_in_action_taco_1.repository.CrudOrderRepository;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//public class DataJpaOrderRepository  implements OrderRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    private final CrudOrderRepository crudOrderRepository;
//
//    public DataJpaOrderRepository(CrudOrderRepository crudOrderRepository) {
//        this.crudOrderRepository = crudOrderRepository;
//    }
//
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        return null;
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return false;
//    }
//
//    @Override
//    public Ingredient get(int id) {
//        return null;
//    }
//
//    @Override
//    public List<Ingredient> getAll() {
//        return null;
//    }
//}
