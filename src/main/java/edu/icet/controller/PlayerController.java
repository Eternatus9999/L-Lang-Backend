package edu.icet.controller;

import edu.icet.dto.Player;
import edu.icet.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/player")
@RequiredArgsConstructor
@Slf4j
public class PlayerController {

    final PlayerService playerservice;

    @GetMapping("/get-player-id/{id}")
    public Player getPlayerById(@PathVariable long id){
        return playerservice.getById(id);
    }

    @GetMapping("/get-player-name/{name}")
    public Player getPlayerByName(@PathVariable String name){
        return playerservice.getByName(name);
    }

    @PostMapping("/add-player")
    public String addPlayer(@RequestBody Player player){
        if(playerservice.add(player)){
            return "Player Added Successfully";
        }
        return "Player didn't Added Successfully";
    }
    @PutMapping("/update-player")
    public String updatePlayer(@RequestBody Player player){
        if(playerservice.update(player)){
            return "Player Updated Successfully";
        }
        return "Player didn't Updated Successfully";
    }
    @DeleteMapping("/delete-player/{id}")
    public String deletePlayer(@PathVariable long id){
        if(playerservice.delete(id)){
            return "Player Deleted Successfully";
        }
        return "Player didn't Deleted Successfully";
    }
    @GetMapping
    public List<Player> getAll(){
        return playerservice.getAll();
    }
}
