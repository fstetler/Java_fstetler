package com.example.springLearning.repository;

import com.example.springLearning.model.Mineral;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MineralRepository extends CrudRepository<Mineral, Integer> {
    

}
