package com.example.bootquickstart.ifaces;


import com.example.bootquickstart.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {

    public Player findByPlayerName(String playerName);
}
