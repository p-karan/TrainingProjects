package com.example.demo.repo;

import com.example.demo.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyRepository extends JpaRepository<Catalog,Integer> {
    public List<Catalog> findAllById(int id);

}
