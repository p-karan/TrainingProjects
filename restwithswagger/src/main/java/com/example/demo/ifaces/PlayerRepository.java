package com.example.demo.ifaces;


import com.example.demo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {

    public Player findByPlayerName(String playerName);
}
