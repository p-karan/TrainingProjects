package com.example.demo.controller;

import com.example.demo.entity.Catalog;
import com.example.demo.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value="*")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping(value="/catalog/{id}")
    public List<Catalog> findCatalogById(@PathVariable("{id}")int id){
        return  this.service.findAllbyCatalogId(id);
    }

    @GetMapping(value="/catalog")
    public List<Catalog> findAll(){
        return  this.service.getAll();
    }

    @PutMapping(value="/catalog",produces="application/json",consumes="application/json")
    public Catalog addCatalog(@RequestBody Catalog catalog){
        return this.service.addCatalog(catalog);
    }
}
