package com.example.spring_in_action_taco_1.repository;

import com.example.spring_in_action_taco_1.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface CrudOrderRepository extends CrudRepository<TacoOrder, Long> {
}
