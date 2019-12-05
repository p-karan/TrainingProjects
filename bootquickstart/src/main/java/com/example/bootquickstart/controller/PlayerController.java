package com.example.bootquickstart.controller;

import com.example.bootquickstart.entity.Player;
import com.example.bootquickstart.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService service;

    @GetMapping(value = "/player")
    public List<Player> getPlayer(){
        return this.service.getAll();
    }
    @GetMapping(value="/player/{name}")
    public Player getPlayerByName(@PathVariable("name") String name){
        return this.service.findPlayerByName(name);
    }
    @PostMapping(value = "/player", produces="application/json",consumes="application/json")
    public Player addPlayer(@Valid @RequestBody Player player){
        return  this.service.addPlayer(player);
    }

}
