package com.example.demo.services;

import com.example.demo.entity.Player;
import com.example.demo.ifaces.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repo;

    public List<Player> getAll(){
        return this.repo.findAll();
    }

    public Player addPlayer(Player player){
        return  this.repo.save(player);
    }

    public Player findPlayerByName(String playerName){
        return this.repo.findByPlayerName(playerName);
    }
}
