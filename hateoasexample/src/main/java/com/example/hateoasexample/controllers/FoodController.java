package com.example.hateoasexample.controllers;

import com.example.hateoasexample.entity.Food;
import com.example.hateoasexample.repo.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodRepository repo;

    @GetMapping(value="/food")
    public List<Food> findAll(){
        return this.repo.findAll();
    }

    @GetMapping(value="/food/{cuisine}",produces = "application/hal+json")
    public Resources<Food> findByCuisine( @PathVariable ("cuisine")String cuisine){
        List<Food> foodList=this.repo.findAllByCuisine(cuisine);
        Link allCuisines=linkTo(methodOn(FoodController.class).findAll()).withRel("allCuisines");
        Link allHotels=linkTo(methodOn(HotelController.class).findAll()).withRel("allHotels");
        Resources<Food> resource=new Resources<>(foodList,allCuisines,allHotels);
        return resource;
    }

}
