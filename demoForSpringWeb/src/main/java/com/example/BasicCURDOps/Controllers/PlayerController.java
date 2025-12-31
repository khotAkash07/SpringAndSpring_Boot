package com.example.BasicCURDOps.Controllers;

import com.example.BasicCURDOps.Entity.Player;
import com.example.BasicCURDOps.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playerApi")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/showPlayers")
    public List<Player> displayPlayer(){
        return playerService.DisplayPlayers();
    }

    @PostMapping("/addPlayer")
    public void AddPlayer(@RequestBody Player p){
        playerService.AddPlayer(p);
    }

    @PostMapping("/addAllPlayers")
    public void saveAllPlayers(@RequestBody List<Player> list) {
        playerService.addPlayers(list);
    }

    @GetMapping("/getById/{id}")
    public Player getPlayerById(@PathVariable int id){
        return playerService.getPlayerById(id);
    }

    @PutMapping("/updatePlayer")
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public void deletePlayer(@PathVariable long id){
        playerService.deletePlayer(id);
    }
}
