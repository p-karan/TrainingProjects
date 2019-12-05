package com.example.hateoasexample.repo;

import com.example.hateoasexample.entity.Food;
import com.example.hateoasexample.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {
    public List<Food> findAllByCuisine(String cuisine);

}
