package com.example.BasicCURDOps.Services;

import com.example.BasicCURDOps.Entity.Player;
import com.example.BasicCURDOps.Repositorys.PlayerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {


    private final PlayerRepo playerRepo;

    // Constructor Injection
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }


    public void addPlayers(List<Player> list){
        playerRepo.saveAll(list);
    }
    public void AddPlayer(Player p){
        playerRepo.save(p);
    }

    public List<Player> DisplayPlayers() {
        return playerRepo.findAll();
    }

    public Player getPlayerById(long id) {

        return playerRepo.findById(id).orElse(new Player(0,"null",0));
    }

    public void updatePlayer(Player player) {
        playerRepo.save(player);
    }

    public void deletePlayer(long id) {
        playerRepo.deleteById(id);
    }
}
